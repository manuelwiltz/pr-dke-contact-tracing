# Documentation

## Agenda
Überblick über die Software und die Funktionern, welche diese erfüllt. 
- Funktionen, welche das System erfüllt
- Komponenten

Überblick über die benötigte Software sowie die Installation der Anwendung um diese auf dem eigenen Laptop lauffähig zu bekommen. 
- Software
- Installation

Verfügbare Schnittstellen
- REST Schnittstellen


## Funktionen 

### Contact Tracing
Als Contact-Tracer (CT) ist es meine Aufgabe, im Rahmen des Contact-Tracings Personen zu verwalten, 
Cluster zu erkennen und Tests zuzuweisen. Dazu erfasse ich die relevanten Informationen von erkrankten 
Personen sowie deren Kontaktpersonen und weise ihnen einen Quarantäne-Zeitraum zu. Durch die Verwaltung 
der Personen und die Analyse von Kontakten kann ich Cluster identifizieren, bei denen mehrere erkrankte 
Personen involviert sind. 

- **Als CT erfasse ich eine Person mit Vorname, Nachname, Geburtsdatum, Sozialversicherungsnummer, Adresse (inkl. Bezirk) und Kontakt-Informationen.**
Die erste User Story befasst sich mit der Erfassung von Personen und deren relevanten 
- Informationen wie Vorname, Nachname, Geburtsdatum, Sozialversicherungsnummer, 
- Adresse (einschließlich Bezirk) und Kontaktdaten.

- **Als CT halte ich fest, ob die Person selbst erkrankt ist, Symptome hat und somit ein Verdachtsfall ist oder der Kontakt einer bereits erkrankten Person ist, aber selbst keine Symptome hat.**
Diese User Story beinhaltet das Festhalten des Krankheitsstatus einer Person. Es wird 
- unterschieden, ob die Person selbst erkrankt ist und Symptome hat (Verdachtsfall) 
- oder ob sie lediglich Kontakt zu einer erkrankten Person hatte, aber selbst keine Symptome zeigt.

- **Als CT weise ich erkrankten Personen und ihren Kontakten einen Quarantäne-Zeitraum zu.**
In dieser User Story wird festgehalten, dass erkrankten Personen und ihren Kontakten ein 
- Quarantäne-Zeitraum zugewiesen wird. Dadurch soll die Ausbreitung von Krankheiten eingedämmt werden.

- **Als CT muss ich eine bereits erfasste Person suchen können, um den Krankheitsstatus aktualisieren zu können.**
Diese User Story umfasst die Funktion, eine bereits erfasste Person im System zu suchen. 
- Dadurch kann der Krankheitsstatus der Person aktualisiert werden.

- **Als CT lege ich einen Cluster an, sobald eine erkrankte Person zwei Kontakte hat, die ebenfalls erkrankt sind.**
Hierbei geht es darum, dass ein Cluster angelegt wird, sobald eine erkrankte Person mindestens zwei 
- Kontakte hat, die ebenfalls erkrankt sind. Dies hilft bei der Identifikation von Ausbruchsherden 
- und ermöglicht gezielte Maßnahmen.

- **Als CT weise ich Verdachtsfällen einen Testtermin zu.**
In dieser User Story wird beschrieben, dass Verdachtsfällen ein Testtermin zugewiesen wird. Dadurch 
- können sie auf das Vorliegen einer Erkrankung überprüft werden.

- **Als CT erfasse ich das Datum eines positiven Tests.**
Diese User Story befasst sich mit der Erfassung des Datums eines positiven Tests. Dies ist wichtig,
- um den Verlauf der Erkrankung zu verfolgen und entsprechende Maßnahmen zu ergreifen.


### Bezirkshauptmann / Bezirkshauptfrau (BH) 
Als Bezirkshauptmann/Bezirkshauptfrau (BH) ist es von großer Bedeutung, den Überblick über 
die Gesundheitssituation im eigenen Bezirk zu behalten. Dazu benötige ich Informationen
darüber, wie viele Personen in meinem Bezirk erkrankt sind und ob es mögliche Cluster
gibt. Durch regelmäßige Updates vom Contact-Tracing-Team erhalte ich aktuelle Daten 
zu den erkrankten Personen und den identifizierten Clustern. Auf Basis dieser Informationen 
kann ich geeignete Maßnahmen ergreifen, um die Ausbreitung von Krankheiten einzudämmen und
die Gesundheit der Bürgerinnen und Bürger in meinem Bezirk zu schützen.

- **Als BH habe ich die aktuellen Zahlen visuell aufbereitet zur Verfügung. Wie viele Personen sind krank, Verdachtsfälle, in Quarantäne. Wie viele Cluster gibt es, wo und wie sind sie entstanden und wie viele Personen sind betroffen.**
Diese User Story befasst sich damit, dass der Bezirkshauptmann/Bezirkshauptfrau (BH) 
- Zugriff auf die aktuellen Zahlen der Gesundheitssituation im Bezirk hat. 
- Die Zahlen werden visuell aufbereitet präsentiert und umfassen Informationen 
- wie die Anzahl der erkrankten Personen, Verdachtsfälle, Personen in Quarantäne sowie 
- die Anzahl und Herkunft der Cluster. Durch diese visuelle Darstellung erhält 
- der BH einen schnellen Überblick über die aktuelle Lage.

- **Als BH weiß ich, wie viele Personen einen Termin für die Verabreichung eines Medikamentes gebucht haben.**
Diese User Story beschreibt, dass der BH Informationen darüber hat, wie viele Personen einen Termin
- für die Verabreichung eines Medikaments gebucht haben. Diese Informationen ermöglichen es dem BH, 
- die erforderlichen Ressourcen für die Medikamentenvergabe zu planen und sicherzustellen, 
- dass alle betroffenen Personen angemessen versorgt werden. Durch das Wissen um die Anzahl 
- der Termine kann der BH sicherstellen, dass die Verabreichung der Medikamente gemäß dem 
- vorgesehenen Zeitplan erfolgt.

## Komponenten
Die Anwendung besteht aus einigen Komponenten, welche im Folgenden aufgelistet werden. 

### Menü Komponente 
Die Menü-Komponente ist eine Navigationsleiste mit den folgenden Eigenschaften:

![menu.png](images/menu.png)

**Übersicht**: Diese Option navigiert den Benutzer zur Übersichtsseite, auf der alle Personen aufgelistet sind. Dort kann der Benutzer Informationen über alle erfassten Personen einsehen.

**Add Person**: Durch Auswahl dieser Option gelangt der Benutzer zu einer Seite, auf der er eine neue Person hinzufügen kann. Dort können alle relevanten Informationen zur Person erfasst werden.

**Cluster**: Bei Auswahl dieser Option wird der Benutzer zu einer Seite weitergeleitet, auf der alle erkannten Cluster aufgelistet sind. Hier erhält der Benutzer Informationen darüber, wo und wie die Cluster entstanden sind und wie viele Personen davon betroffen sind.

**Rolle wechseln**: Diese Option führt den Benutzer zurück zur Login-Seite, auf der er zwischen den Rollen Bezirkshauptmann/Bezirkshauptfrau (BH) und Contact-Tracer (CT) wechseln kann. Durch diese Funktion kann der Benutzer je nach Bedarf zwischen den beiden Rollen wechseln, um entsprechende Aufgaben auszuführen.

Die Menü-Komponente stellt somit eine einfache und benutzerfreundliche Navigation bereit, die dem Benutzer ermöglicht, schnell zwischen verschiedenen Funktionen und Seiten innerhalb des Systems zu wechseln.

### Login Komponente 
Die Login-Komponente bietet folgende Funktionen:

![login.png](images/login.png)

**Auswahl zwischen den beiden Rollen CT und BH:** Der Benutzer hat die Möglichkeit, 
zwischen den beiden Rollen als Contact-Tracer (CT) und Bezirkshauptmann/Bezirkshauptfrau (BH) 
zu wählen. Diese Auswahl erfolgt während des Login-Prozesses und bestimmt die entsprechenden
Funktionen und Aufgaben, auf die der Benutzer zugreifen kann.

- **Auflistung der möglichen Funktionen/Tasks:** Beim Login wird dem Benutzer 
eine Übersicht über die möglichen Funktionen und Aufgaben angezeigt, die mit der 
ausgewählten Rolle verbunden sind. Dies kann eine Liste von Aufgaben wie das 
Verwalten von Personen, das Erstellen von Clustern, das Zuweisen von Quarantäne-Zeiträumen 
oder das Anzeigen von Statistiken. 
Die Auflistung hilft dem Benutzer, einen Überblick über die verfügbaren Funktionen 
zu erhalten und schnell auf die gewünschten Bereiche des Systems zuzugreifen.

- **Beim Einloggen als BH Auswahl von Bundesland und Bezirk:** Wenn der Benutzer sich als 
Bezirkshauptmann/Bezirkshauptfrau (BH) einloggt, wird ihm eine zusätzliche Auswahlmöglichkeit 
für das Bundesland und den Bezirk angeboten. Diese Auswahl ist wichtig, da der BH 
spezifische Informationen und Daten für seinen Bezirk benötigt, um seine Aufgaben 
und Verantwortlichkeiten optimal wahrnehmen zu können. Die Auswahl von 
Bundesland und Bezirk ermöglicht es dem System, die relevanten Daten für den BH 
bereitzustellen und die Navigation auf seine spezifischen Zuständigkeiten auszurichten.

Die Login-Komponente bildet somit den Einstiegspunkt in das System und ermöglicht es den Benutzern, sich mit ihrer Rolle anzumelden und auf die entsprechenden Funktionen und Daten zuzugreifen. Durch die klare Auswahl der Rolle und die Auflistung der verfügbaren Funktionen wird eine benutzerfreundliche und zielgerichtete Navigation im System gewährleistet.


### Personen Übersicht Komponente
Die Personen-Übersichts-Komponente bietet folgende Funktionen:

![person_overview.png](images/person_overview.png)

**Anzeigen einer Tabelle mit allen wesentlichen Informationen:** 
In dieser Komponente wird dem Benutzer eine Tabelle präsentiert, die alle 
wesentlichen Informationen zu den erfassten Personen enthält. 
Dazu gehören die Sozialversicherungsnummer (SVNR), Vorname, Nachname, Informationen darüber, 
ob die Person erkrankt ist, ob Symptome vorliegen und ob die Person in Quarantäne ist. 
Durch diese tabellarische Darstellung erhält der Benutzer einen schnellen Überblick 
über alle erfassten Personen und deren wichtigste Daten.

**Erfassen und Bearbeiten von Gesundheitsdaten:** Innerhalb der 
Personen-Übersichts-Komponente hat der Benutzer die Möglichkeit, 
Gesundheitsdaten einer bestimmten Person zu erfassen oder zu bearbeiten. 
Dies kann Informationen wie den aktuellen Krankheitsstatus, Kontakte, das Vorhandensein von Symptomen 
oder den Quarantäne-Zustand betreffen. Durch diese Funktion kann der Benutzer die 
Gesundheitsdaten einer Person aktualisieren und auf dem neuesten Stand halten.

**Löschen der Person:**  Falls erforderlich, kann der Benutzer eine Person 
aus der Übersicht löschen. Dies kann notwendig sein, wenn eine Person beispielsweise 
das System verlassen hat oder die Daten aus anderen Gründen nicht mehr relevant sind. 
Das Löschen einer Person entfernt alle zugehörigen Daten und Informationen aus der Datenbank.

**Bearbeiten der Person:** Falls sich die Informationen einer Person ändern, 
kann der Benutzer die entsprechenden Daten innerhalb der Übersicht bearbeiten. 
Dies ermöglicht es, beispielsweise den Namen, die Kontaktdaten oder andere 
wichtige Informationen einer Person anzupassen. Durch die Bearbeitungsfunktion 
kann der Benutzer sicherstellen, dass die Daten stets korrekt und aktuell sind.

Die Personen-Übersichts-Komponente bietet dem Benutzer eine zentrale Anlaufstelle, 
um alle relevanten Informationen zu den erfassten Personen einzusehen, Gesundheitsdaten 
zu erfassen und zu bearbeiten, Personen zu löschen und Informationen zu aktualisieren. 
Durch diese Funktionen wird eine effiziente Verwaltung und Aktualisierung der 
Personeninformationen im System ermöglicht.

### Add Person Komponente
Die Person Hinzufügen Komponente bietet folgende Funktionen:

![add_person.png](images/add_person.png)

**Kontakte zu einer Person hinzufügen:** Diese Funktion ermöglicht es dem Benutzer, 
Kontakte einer bestimmten Person hinzuzufügen. Die Kontakte können andere 
Personen sein, die mit der erfassten Person in Verbindung stehen, beispielsweise 
Familienmitglieder, Freunde oder Arbeitskollegen. Durch das Hinzufügen von 
Kontakten können mögliche Infektionsketten nachvollzogen und gegebenenfalls 
weitere Maßnahmen ergriffen werden.

**Allgemeine Daten hinzufügen:** In dieser Komponente kann der Benutzer allgemeine 
Daten einer Person eingeben. Dazu gehören die Sozialversicherungsnummer (SVNR), 
Vorname, Nachname, Geburtstag, E-Mail-Adresse und Telefonnummer. Diese Informationen 
dienen dazu, eine eindeutige Identifizierung der Person zu ermöglichen und die 
Kommunikation im Zusammenhang mit dem Contact-Tracing-Prozess zu erleichtern.

**Adressdaten hinzufügen:** Der Benutzer kann auch Adressdaten einer Person erfassen. 
Dazu gehören Straße, Hausnummer, Bundesland, Bezirk und Land. Diese Informationen sind 
wichtig, um den geografischen Standort der erfassten Person zu kennen und gegebenenfalls 
gezielte Maßnahmen in bestimmten Regionen ergreifen zu können.

Durch die Person Hinzufügen Komponente wird der Benutzer in die Lage versetzt, 
eine neue Person in das System einzuführen und alle relevanten Daten zu erfassen. 
Die Möglichkeit, Kontakte, allgemeine Daten und Adressdaten hinzuzufügen, ermöglicht 
eine umfassende Dokumentation und ein effektives Contact-Tracing-Verfahren.

### Gesundheitsdaten Komponente
Die Gesundheitsdaten-Komponente bietet folgende Funktionen:

![gesundheitsdaten.png](images/gesundheitsdaten.png)

**Symptom-Status setzen:** Der Benutzer kann den Symptom-Status einer Person 
auf "Ja" oder "Nein" setzen. Wenn Symptome vorliegen, wird der Benutzer auch 
das Datum angeben, seit wann die Symptome bestehen, sowie den Termin für den 
Test. Diese Informationen sind wichtig, um potenzielle Verdachtsfälle zu 
identifizieren und geeignete Maßnahmen einzuleiten.

**Verdachtsfall-Status setzen:** Der Benutzer kann den Verdachtsfall-Status 
einer Person auf "Ja" oder "Nein" setzen. Dies ermöglicht die Kennzeichnung 
einer Person als möglichen Verdachtsfall, selbst wenn keine Symptome vorliegen. 
Dies ist hilfreich, um Personen zu identifizieren, die möglicherweise Kontakt 
mit erkrankten Personen hatten und weitere Untersuchungen oder Tests erfordern.

**Erkrankt-Status setzen:** Der Benutzer kann den Erkrankt-Status einer Person 
auf "Ja" oder "Nein" setzen. Wenn eine Person als erkrankt markiert ist, kann 
der Benutzer auch das Datum angeben, an dem die Quarantäne beginnt und endet. 
Dies ermöglicht es, den Quarantäne-Zeitraum entsprechend festzulegen und die 
erforderlichen Maßnahmen zu ergreifen.

**Auflistung der Kontakte als Tabelle:** In dieser Komponente wird dem Benutzer 
eine Tabelle präsentiert, die alle Kontakte einer bestimmten Person auflistet. 
Dies ermöglicht es dem Benutzer, einen Überblick über die Kontakte zu haben und 
gegebenenfalls weitere Maßnahmen zu ergreifen, wie zum Beispiel das Senden der 
Kontakte in Quarantäne.

**Funktion zum Senden aller Kontakte in Quarantäne:** Der Benutzer kann mit einer 
Funktion alle Kontakte einer Person gleichzeitig in Quarantäne schicken. Diese 
Funktion erleichtert das Verwalten und Durchführen von Quarantäne-Maßnahmen für 
die Kontakte einer erkrankten Person.

**Erfassen eines positiven Tests:** Der Benutzer hat die Möglichkeit, einen 
positiven Test für eine Person zu erfassen. Dies ermöglicht es, den aktuellen 
Gesundheitszustand der Person zu dokumentieren und weitere Maßnahmen, wie zum 
Beispiel die Ermittlung von Kontaktpersonen, einzuleiten.

Die Gesundheitsdaten-Komponente bietet dem Benutzer eine zentrale Stelle, um alle 
relevanten Gesundheitsdaten einer Person zu erfassen und zu verwalten. Durch das 
Setzen von Symptom-, Verdachtsfall- und Erkrankt-Status sowie das Verwalten der 
Kontakte und das Erfassen eines positiven Tests wird eine effiziente und umfassende 
Erfassung und Verwaltung der Gesundheitsdaten ermöglicht.

### BH Komponente
Die BH-Komponente bietet folgende Funktionen:

![bh.png](images/bh.png)

**Visualisierung der Anzahl erkrankter Personen:** In dieser Komponente wird dem 
Bezirkshauptmann/der Bezirkshauptfrau eine visuelle Darstellung präsentiert, 
die die Anzahl der erkrankten Personen im Bezirk zeigt.

**Visualisierung der Anzahl von Personen mit Symptomen:** Der BH kann in dieser Komponente 
die Anzahl der Personen mit Symptomen im Bezirk visualisieren.

**Visualisierung der Anzahl von Personen in Quarantäne:** Die BH-Komponente zeigt dem 
Bezirkshauptmann/der Bezirkshauptfrau auch die Anzahl der Personen an, 
die sich derzeit in Quarantäne befinden. 

**Visualisierung der Anzahl von Verdachtsfällen:** Der BH kann in dieser Komponente 
die Anzahl der Verdachtsfälle im Bezirk visualisieren. 

**Visualisierung der Anzahl von Clustern:** Die BH-Komponente bietet dem 
Bezirkshauptmann/der Bezirkshauptfrau auch eine visuelle Darstellung der Anzahl von 
Clustern im Bezirk. 

**Visualisierung der Anzahl von Medikamenten-Buchungsterminen:** In dieser Komponente 
kann der BH die Anzahl der gebuchten Termine für die Verabreichung von 
Medikamenten im Bezirk visualisieren. 

Die BH-Komponente bietet dem Bezirkshauptmann/der Bezirkshauptfrau eine umfassende 
Visualisierung der wichtigsten statistischen Informationen über den Bezirk, 
einschließlich der Anzahl erkrankter Personen, Personen mit Symptomen, Personen in 
Quarantäne, Verdachtsfälle, Cluster und gebuchter Medikamenten-Buchungstermine. 



## Software
Die nachfolgende Software wird benötigt, um das Projekt lokal auf dem eigenen Rechner aufzusetzen
und lauffähig zu machen. 

### Git
GIT ist ein verteiltes Versionskontrollsystem, das entwickelt wurde, 
um Änderungen in Dateien und Projekten zu verfolgen, zu verwalten und zu 
synchronisieren, insbesondere bei der Zusammenarbeit von Entwicklern an Softwareprojekten.

Link zur Installation:
https://git-scm.com/

### Node JS
Node.js ist eine serverseitige Laufzeitumgebung, die auf der 
JavaScript-Plattform aufbaut und es Entwicklern ermöglicht, 
JavaScript-Code außerhalb eines Webbrowsers auszuführen, 
um skalierbare und effiziente Netzwerkanwendungen zu erstellen.

Link zur Installation:
https://nodejs.org/en

### Java
Java ist eine objektorientierte Programmiersprache, die entwickelt 
wurde, um plattformunabhängige Anwendungen zu erstellen. Sie 
ermöglicht die Entwicklung von robusten und sicheren Softwarelösungen 
für eine Vielzahl von Anwendungsdomänen.

Link zur Installation:
https://www.java.com/de/download/manual.jsp

### IntelliJ
IntelliJ IDEA ist eine integrierte Entwicklungsumgebung (IDE) für 
Softwareentwicklung, die eine Vielzahl von Tools und Funktionen bietet, 
um Entwicklern bei der effizienten Erstellung, Bearbeitung und Debugging 
von Code in verschiedenen Programmiersprachen wie Java und Kotlin zu unterstützen.

Link zur Installation:
https://www.jetbrains.com/de-de/idea/

### Postman
Postman ermöglicht es APIs zu testen, zu dokumentieren und zu verwalten. Mit Postman 
können HTTP-Anfragen gesendet, Antworten überprüft und verschiedene 
API-Szenarien simuliert werden.

Link zur Installation:
https://www.postman.com/


### MariaDB
MariaDB ist ein relationales Datenbankverwaltungssystem (RDBMS), 
das auf der Open-Source-Version von MySQL basiert. Es bietet eine 
zuverlässige, leistungsstarke und skalierbare Datenbanklösung für 
die Speicherung und Verwaltung von Daten in verschiedenen Anwendungen und Umgebungen.

Link zur Installation:
https://mariadb.org/

### MySQL Workbench
MySQL Workbench ist eine grafische integrierte Entwicklungsumgebung (IDE) 
für die Verwaltung von MySQL-Datenbanken. Es bietet Tools zum Entwerfen 
von Datenbanken, zum Erstellen und Ausführen von SQL-Abfragen, zum 
Datenbankmonitoring und zur Verwaltung von Verbindungen, Tabellen und Benutzern.

Link zur Installation:
https://www.mysql.com/products/workbench/

### Docker Desktop
Docker ist eine Open-Source-Plattform, die es ermöglicht, Anwendungen und 
deren Abhängigkeiten in isolierten Containern zu verpacken und auszuführen. 
Dadurch wird eine konsistente Bereitstellung von Anwendungen über 
verschiedene Umgebungen hinweg erleichtert und die Skalierbarkeit und 
Portabilität von Anwendungen verbessert.

Link zur Installation:
https://www.docker.com/products/docker-desktop/

## Installation
Hier sind überblicksmäßig alle erforderlichen Schritte aufgelistet, welche notwendig 
sind um die Applikation lokal aufzusetzen. 

### Git clone
Zuerst muss das Git Repository ge-cloned werden: \
https://github.com/manuelwiltz/pr-dke-contact-tracing

git clone \
```git@github.com:manuelwiltz/pr-dke-contact-tracing.git```

### Angular Development server

Navigiere vom Projektverzeichnis in das frontend Verzeichnis. \
Starte `ng serve` in der Command Line für den dev server. \
Navigiere zu `http://localhost:4200/`. \
Die Anwendung lädt automatisch neu, wenn Änderungen im Angular Projekt durchgeführt werden.

### Datenbank
Einloggen in MariaDB mit dem zuvor festgelegten Username und Passwort. \
Anschließend die Datenbank erstellen, um diese anschließend im Backend verwenden zu können. \
``create database contactTracing;`` \
``use contactTracing;``

Stelle sicher, dass der Port 3306 lokal nicht verwendet wird, sonst kann der Docker Container
nicht gestartet werden. \
Führe anschließend den Befehl ``docker-compose up`` im Root Level des Projekverzeichnisses aus
um den docker Container für die MariaDB Datenbank zu starten.

### Backend
Öffne das Backend Projekt in IntelliJ und führe die Standard Konfiguration im Main File aus. 

## UML Diagramm
![img.png](images/uml.png)

## REST Schnittstellen
Hier sind alle verfügbaren REST Schnittstellen aufgeführt:

<h3>Table of Contents </h3>
  <div class="method-summary"></div>
  <h4><a href="#PersonAPI">PersonAPI</a></h4>
  <ul>
  <li><code><span class="http-method">post</span> /person</code></li>
  <li><code><span class="http-method">delete</span> /person/{svnr}</code></li>
  <li><code><span class="http-method">get</span> /person</code></li>
  <li><code><span class="http-method">get</span> /person/{svnr}/contacts</code></li>
  <li><code><span class="http-method">get</span> /persons/{state}/{county}</code></li>
  <li><code><span class="http-method">get</span> /persons/length</code></li>
  <li><code><span class="http-method">get</span> /person/{svnr}</code></li>
  <li><code><span class="http-method">put</span> /persons/</code></li>
  <li><code><span class="http-method">get</span> /person/{svnr}/sickinformation</code></li>
  <li><code><span class="http-method">get</span> /persons/length/{state}/{county}</code></li>
  <li><code><span class="http-method">put</span> /person/{svnr}</code></li>
  <li><code><span class="http-method">put</span> /person/{svnr}/sickinformation</code></li>
</ul>

```json
{
  "openapi": "3.0.1",
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:9191",
      "description": "Generated server url"
    }
  ],
  "tags": [
    {
      "name": "Person API",
      "description": "API for Persons and their information and contacts"
    }
  ],
  "paths": {
    "/persons/": {
      "put": {
        "tags": [
          "Person API"
        ],
        "summary": "Get a list of persons by their social security numbers.",
        "description": "Returns a list persons by their social security numbers.",
        "operationId": "getPersonsBySvnr",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "type": "array",
                "description": "Unique social security numbers",
                "items": {
                  "type": "integer",
                  "format": "int32"
                }
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Person"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/person/{svnr}": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get a person by their social security number.",
        "description": "Returns a person by their social security number.",
        "operationId": "getPersonBySvnr",
        "parameters": [
          {
            "name": "svnr",
            "in": "path",
            "description": "Unique social security number",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "integer",
              "format": "int32"
            },
            "example": 12345678
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Person"
                }
              }
            }
          }
        }
      },
      "put": {
        "tags": [
          "Person API"
        ],
        "summary": "Update a person.",
        "description": "Updates and returns the person.",
        "operationId": "updatePerson",
        "parameters": [
          {
            "name": "svnr",
            "in": "path",
            "description": "Unique social security number",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "integer",
              "format": "int32"
            },
            "example": 12345678
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Person"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Person"
                }
              }
            }
          }
        }
      },
      "delete": {
        "tags": [
          "Person API"
        ],
        "summary": "Delete a person.",
        "description": "Deletes and returns the person.",
        "operationId": "deletePerson",
        "parameters": [
          {
            "name": "svnr",
            "in": "path",
            "description": "Unique social security number",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "integer",
              "format": "int32"
            },
            "example": 12345678
          }
        ],
        "responses": {
          "200": {
            "description": "OK"
          }
        }
      }
    },
    "/person/{svnr}/sickinformation": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get the sick information of a person.",
        "description": "Returns the sick information of a person.",
        "operationId": "getSickInformationFromPerson",
        "parameters": [
          {
            "name": "svnr",
            "in": "path",
            "description": "Unique social security number",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "integer",
              "format": "int32"
            },
            "example": 12345678
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/SickInformation"
                }
              }
            }
          }
        }
      },
      "put": {
        "tags": [
          "Person API"
        ],
        "summary": "Update a persons sick information.",
        "description": "Updates and returns the persons sick information.",
        "operationId": "updateSickInformationFromPerson",
        "parameters": [
          {
            "name": "svnr",
            "in": "path",
            "description": "Unique social security number",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "integer",
              "format": "int32"
            },
            "example": 12345678
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/SickInformation"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/SickInformation"
                }
              }
            }
          }
        }
      }
    },
    "/person": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get a list of all persons.",
        "description": "Returns a list of all persons.",
        "operationId": "getAllPerson",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Person"
                  }
                }
              }
            }
          }
        }
      },
      "post": {
        "tags": [
          "Person API"
        ],
        "summary": "Create a person.",
        "description": "Creates and returns a person.",
        "operationId": "addPerson",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Person"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Person"
                }
              }
            }
          }
        }
      }
    },
    "/persons/{state}/{county}": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get list of people by state and county.",
        "description": "Returns a list of people by state and county.",
        "operationId": "getPeopleByStateAndCounty",
        "parameters": [
          {
            "name": "state",
            "in": "path",
            "description": "State (Bundesland)",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "string"
            },
            "example": "Upper Austria"
          },
          {
            "name": "county",
            "in": "path",
            "description": "County (Bezirk)",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "string"
            },
            "example": "Linz"
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Person"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/persons/length": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get the total count of people.",
        "description": "Returns a number containing the sum of all people.",
        "operationId": "getPeopleLength",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "integer",
                  "format": "int32"
                }
              }
            }
          }
        }
      }
    },
    "/persons/length/{state}/{county}": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get list of people by state and county.",
        "description": "Returns a list of people by state and county.",
        "operationId": "getTotalAmountOfPeopleByStateAndCounty",
        "parameters": [
          {
            "name": "state",
            "in": "path",
            "description": "State (Bundesland)",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "string"
            },
            "example": "Upper Austria"
          },
          {
            "name": "county",
            "in": "path",
            "description": "County (Bezirk)",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "string"
            },
            "example": "Linz"
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "integer",
                  "format": "int32"
                }
              }
            }
          }
        }
      }
    },
    "/person/{svnr}/contacts": {
      "get": {
        "tags": [
          "Person API"
        ],
        "summary": "Get the contacts of a person.",
        "description": "Returns a list of social security numbers to identify their contacts.",
        "operationId": "getContactsFromPerson",
        "parameters": [
          {
            "name": "svnr",
            "in": "path",
            "description": "Unique social security number",
            "required": true,
            "style": "simple",
            "explode": false,
            "schema": {
              "type": "integer",
              "format": "int32"
            },
            "example": 12345678
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "type": "string"
                  }
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "Address": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int32"
          },
          "streetName": {
            "type": "string"
          },
          "doorNumber": {
            "type": "string"
          },
          "county": {
            "type": "string"
          },
          "state": {
            "type": "string"
          },
          "country": {
            "type": "string"
          }
        }
      },
      "Person": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int32"
          },
          "svnr": {
            "type": "integer",
            "format": "int32"
          },
          "firstName": {
            "type": "string"
          },
          "lastName": {
            "type": "string"
          },
          "address": {
            "$ref": "#/components/schemas/Address"
          },
          "birthday": {
            "type": "string",
            "format": "date-time"
          },
          "email": {
            "type": "string"
          },
          "phoneNumber": {
            "type": "string"
          },
          "sickInformation": {
            "$ref": "#/components/schemas/SickInformation"
          },
          "contacts": {
            "type": "array",
            "items": {
              "type": "string"
            }
          }
        }
      },
      "SickInformation": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int32"
          },
          "symptoms": {
            "type": "boolean"
          },
          "sick": {
            "type": "boolean"
          },
          "symptomStartingDate": {
            "type": "string",
            "format": "date-time"
          },
          "covidTestDate": {
            "type": "string",
            "format": "date-time"
          },
          "medicationDate": {
            "type": "string",
            "format": "date-time"
          },
          "quarantine": {
            "type": "boolean"
          },
          "quarantineStartDate": {
            "type": "string",
            "format": "date-time"
          },
          "quarantineEndDate": {
            "type": "string",
            "format": "date-time"
          }
        }
      }
    }
  }
}
```










