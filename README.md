# Model Driven & Low Code Playground

This repo is the playground for developing a Model Driven / Low Code DSL to enable fast development and easy control for a data system. Every system contains data of some sort in a certain structure and has some kind of input - in a data structure - to manipulate the internal data and some output - in a data structure - to query the internal state. It should be possible to model all this and run or generate this into a scalable runtime, right? This might feel like another invention of low code ... but there are differences too!

# Design

## Fundamentals

1. **Model Driven**; like UML, Domain Driven Design, [C4 model](https://c4model.com/)
1. **Text Based Sources**; like Markdown to enable Git flows & version control
1. **Maximum reuse of existing tools**; like DSLs and modelling languages
1. **Open Source**; no lock-in whatsoever ... (although a lock-in on languages - either modelling language or programming language - can not be avoided at some point; at least open source provides the opportunity to transform and adapt other languages and forms ;-)
1. **Visualisation**; people think in pictures so images should be generated or even be the interface to develop the sources

## Contexts & Layers

People think in contexts. Things with the same or similar names mean different things in different contexts. So the context matters.

People connect things which are on the same level of abstraction. Tree and molecules are quite hard to connect. Trees and apples are easy. Molecules and cells are too.

So contexts and layers are essential aspects in modelling a system (or system of systems). The visualisation of the system should support zoom and hiding of 'non-layer relevant items'. When trying to mentally grasp the full model of data objects, the fields probably don't matter. At certain levels the contexts of the data objects are more relevant than the objects itself. Or maybe data objects should be grouped to 'higher level data objects'?

The [C4 model](https://www.infoq.com/articles/C4-architecture-model/) introduces these layers:

1. **System context**; the system in its context
1. **Container**; the bigger parts or building blocks of the system
1. **Component**; grouping of code inside building blocks
1. **Code**; the actual code and UML classes level

# Implementation

Too bad C4 modelling implemented in [structurizr](https://structurizr.com/) is based on services Structurizr provides. It would be better if this would have been open source <span style="background-color: yellow;">[research: or is it open source ... ?]</span>

## Examples

- [Land Administration System](land-administration-system)

## Local Development Environment

- [VSCode] (by `choco install vscode`) with extensions:
  - [jebbs.plantuml] with configuration to use `server` with public [plantuml server](https://www.plantuml.com/plantuml)