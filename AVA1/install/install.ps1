# Install Gradle and Maven
# TODO: Mover pra funcoes separadas
# TODO: Verificar se tem o winget instalado?

Write-Host "`n[*] Checando se o Gradle está instalado...`n"
# Checando se o gradle tá instalado
if (Get-Command gradle -errorAction SilentlyContinue) {
    Write-Host "[!] Gradle está instalado. Nenhum download será realizado"
    exit
} Else {
    Write-Host "[!] Gradle não está instalado. Iniciando a instalação...`n"

    $gradleVersion = "8.0.2"
    $downloadUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-bin.zip"
    $installPath = "$env:HOMEDRIVE\Gradle"

    Write-Host "[*] Baixando Gradle v$gradleVersion..."
    Invoke-WebRequest -Uri $downloadUrl -OutFile "$env:TEMP\gradle-$gradleVersion-bin.zip"

    if (-Not (Test-Path -Path $installPath)) {
        New-Item -Path $installPath -ItemType Directory | Out-Null
    }

    Write-Host "[*] Extraindo..."
    Expand-Archive -Path "$env:TEMP\gradle-$gradleVersion-bin.zip" -DestinationPath $installPath -Force

    [System.Environment]::SetEnvironmentVariable("GRADLE_HOME", "$installPath\gradle-$gradleVersion", [System.EnvironmentVariableTarget]::Machine)

    $path = [System.Environment]::GetEnvironmentVariable("Path", [System.EnvironmentVariableTarget]::Machine)
    if ($path -notlike "*$installPath*") {
        [System.Environment]::SetEnvironmentVariable("Path", "$path;$installPath\gradle-$gradleVersion\bin", [System.EnvironmentVariableTarget]::Machine)
    }

    refreshenv
    Write-Host "`n[!] Instalação do Gradle concluída.`n"    
}

Write-Host "`n[*] Checando se o Maven está instalado...`n"
If (Get-Command mvn -errorAction SilentlyContinue) {
    Write-Host "[!] Maven está instalado. Nenhum download será realizado"
    exit
} Else {
    Write-Host "[!] Maven não está instalado. Iniciando a instalação...`n"

    $mavenVersion = "3.8.6"
    $downloadUrl = "https://archive.apache.org/dist/maven/maven-3/$mavenVersion/binaries/apache-maven-$mavenVersion-bin.zip"
    $installPath = "$env:HOMEDRIVE\Maven"

    # Baixa o Maven
    Write-Host "[*] Baixando Maven v$mavenVersion..."
    Invoke-WebRequest -Uri $downloadUrl -OutFile "$env:TEMP\maven-$mavenVersion-bin.zip"

    # Cria o diretório de instalação
    if (-Not (Test-Path -Path $installPath)) {
        New-Item -Path $installPath -ItemType Directory
    }

    # Extrai o arquivo baixado
    Write-Host "[*] Extraindo..."
    Expand-Archive -Path "$env:TEMP\maven-$mavenVersion-bin.zip" -DestinationPath $installPath -Force

    # Define a variável de ambiente M2_HOME
    [System.Environment]::SetEnvironmentVariable("M2_HOME", "$installPath\apache-maven-$mavenVersion", [System.EnvironmentVariableTarget]::Machine)

    # Adiciona o Maven ao PATH
    $path = [System.Environment]::GetEnvironmentVariable("Path", [System.EnvironmentVariableTarget]::Machine)
    if ($path -notlike "*$installPath*") {
        [System.Environment]::SetEnvironmentVariable("Path", "$path;$installPath\apache-maven-$mavenVersion\bin", [System.EnvironmentVariableTarget]::Machine)
    }

    refreshenv
    Write-Host "[!] Instalação do Maven concluída. Reinicie o terminal para aplicar as mudanças."

}
