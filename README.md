= Compiler l'applications avec Maven
Zakaria Belkheiri
v1, 2022-02-25 : Initial draft
:icons: font
:diagrams: .
:experimental:
:classroom-link: https://classroom.github.com/a/gWXnQmIT
:imagesdir: images

// Useful definitions
:eclipse: http://www.eclipse.org[Eclipse]
:intellij: https://www.jetbrains.com/idea/[IntelliJ]
:maven: http://maven.apache.org/[Maven]
:vscode: https://code.visualstudio.com/[VS Code]

// Specific to GitHub
ifdef::env-github[]
:toc:
:tip-caption: :bulb:
:note-caption: :information_source:
:important-caption: :heavy_exclamation_mark:
:caution-caption: :fire:
:warning-caption: :warning:
:icongit: Git
endif::[]

// Tags
image:https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg["Open in Visual Studio Code",link="https://classroom.github.com/online_ide?assignment_repo_id=7083920&assignment_repo_type=AssignmentRepo"]

//---------------------------------------------------------------

Ce TP vise à être capable de compiler un fichier Java sans être dépendant de son IDE favori.
Cela permet :

- d'être indépendant de tout IDE
- de faire construire l'application de manière automatique (c'est pour plus tard, mais c'est ce qu'on appelle l'intégration continue)

== Générer la javadoc

WARNING: Compiler le code avant de générer la javadoc

Il suffit de d'utiliser la commande `mvn javadoc:javadoc`

== Compiler le code

. 
.
.