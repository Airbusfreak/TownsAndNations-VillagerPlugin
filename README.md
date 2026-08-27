# TownsAndNations VillagerPlugin

Ein Spigot/Paper Plugin für Towns and Nations - Villager als Bewohner zählen und tägliche Zahlungen

## Features

- 🏘️ Villager als Bewohner in Städten zählen
- 💰 Automatische tägliche Zahlungen pro Villager
- 🎯 Konfigurierbare Berufe und Zahlungsbeträge
- 📊 Statistiken und Verwaltung

## Installation

### Voraussetzungen
- Java 17 oder höher
- Maven 3.8 oder höher
- Paper/Spigot Server

### Build

```bash
mvn clean package
```

Die fertige JAR wird in `target/` erstellt.

### Nutzung

1. Die JAR in den `plugins/` Ordner des Servers kopieren
2. Server neu starten
3. Plugin wird automatisch geladen

## Konfiguration

Die Konfiguration befindet sich in `config.yml`:

```yaml
villager:
  count-as-resident: true
  max-villagers-per-town: 100

payments:
  enabled: true
  daily-payment-per-villager: 10.0
  payment-hour: 12
```

## Befehle

- `/villager help` - Zeigt Hilfe
- `/villager reload` - Plugin neuladen

## Permissions

- `villager.admin` - Admin Rechte (default: op)
- `villager.use` - Plugin verwenden (default: true)

## Lizenz

Nicht angegeben

## Autor

Airbusfreak
