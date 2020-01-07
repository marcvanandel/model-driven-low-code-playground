# Model Driven & Low Code Playground

This repo is the playground for developing a Model Driven / Low Code DSL to enable fast development and easy control for a data system. Every system contains data of some sort in a certain structure and has some kind of input - in a data structure - to manipulate the internal data and some output - in a data structure - to query the internal state. It should be possible to model all this and run or generate this into a scalable runtime, right? This might feel like another invention of low code ... but there are differences too!

# Concept

Welcome in the future of software development, the future of a digital world. In a digital world we model the real world and write functions to let the digital world behave like the real world. Software of today always contains some - or even mainly - technical parts to model the real world and to execute the functions mimicing the behaviour of the real world. Would it be possible to remove the technical parts and let the technical parts be the actual modelling and functions?

Yes, there is something like [Model Driven Development](https://martinfowler.com/bliki/ModelDrivenSoftwareDevelopment.html) or [Model Driven Architecture](https://martinfowler.com/bliki/ModelDrivenArchitecture.html) and this is growing fast in the [Low Code Develoment Platform](https://en.wikipedia.org/wiki/Low-code_development_platform)s. But it seems these movements disregard the proper software development methodologies like version control, test drive, flow and drive for automation. So while there is value in these initiatives it seems these initiatives still don't deliver the promises. Steve Cook did predict this already in 2004; [MDA Journal January 2004](http://www.bptrends.com/publicationfiles/01-04%20COL%20Dom%20Spec%20Modeling%20Frankel-Cook.pdf).

On the end of the spectrum there are several initiatives to provide quick start frameworks, like [Ruby on Rails](https://rubyonrails.org/), [Grails](https://grails.org/). This [Convention over Configuration](https://en.wikipedia.org/wiki/Convention_over_configuration) based generators are software developer helpers to produce a prototype within seconds based on a starter model. But after a while and after the ever growing codebase with multiple teammembers these prototypes become a horrible nightmare to sustain and maintain. New initiatives take this in mind and are trying to prevent this pitfall, but are still in early and inmature state, like [Kales](https://kales.dev/docs/foreword).

So now what ... ?

Well, again: _Would it be possible to remove the technical parts and let the technical parts be the actual modelling and functions?_

Targeting the complex domains (= complex business applications) and the 'hardcore' software developer and using the software development metholodogies for proper development and we combine this with the gained knowledge and experience of model driven * and low code strategies ... this should lead to something awesome and incredible, right? And let's prevent ourselves from just being another theoretical exercise and let's take a pragmatic and practical approach to prove this concept.

Let's start with simple UML structures (see also [UML mode](https://martinfowler.com/bliki/UmlMode.html)), looking at the [Domain Driven Design](https://en.wikipedia.org/wiki/Domain-driven_design) building blocks like [Value object](https://en.wikipedia.org/wiki/Domain-driven_design#Building_blocks), [Entity](https://en.wikipedia.org/wiki/Domain-driven_design#Building_blocks), [Domain aggregate](https://en.wikipedia.org/wiki/Domain-driven_design#Building_blocks) (or aggregate for short) with just some simple relationships like composition and encapsulation (we might even leave inheritance out for now because this has some evil complexity towards different implementations - a.k.a. languages). Let's implement this in a fairly high level language like [Kotlin](https://kotlinlang.org/) or maybe [TypeScript](https://www.typescriptlang.org/). And start with a complex domain we - as started at Dutch [Kadaster](https://www.kadaster.nl/) - know pretty well ... but let's go for the internationally standardized version of the [Land Administration Domain Model](https://www.sciencedirect.com/science/article/pii/S0264837715000174) ([ISO 51206](https://www.iso.org/standard/51206.html) LADM v1.x - or maybe even v2.0.alpha which we need to extend with [Domain events](https://en.wikipedia.org/wiki/Domain-driven_design#Building_blocks) from Domain Driven Design ;-)

# Background info

There is many content which might have some input or insight in this. These are the valueble resources used in the research and development of this concept.

- **Martin Fowler**'s [bliki](https://martinfowler.com/bliki/) - Thoughtleader on many aspects in software development in a broad way;
  
  > _Thank you for your insights and your publications about them! Your insight are of great help and inspiration!_

  - [Model Driven Development](https://martinfowler.com/bliki/ModelDrivenSoftwareDevelopment.html) and [Model Driven Architecture](https://martinfowler.com/bliki/ModelDrivenArchitecture.html)
  - [UML mode](https://martinfowler.com/bliki/UmlMode.html)

- **Steve Cook** - Software Architect and UML thinker + criticaster ;-) (note: [retired](http://dslbook.azurewebsites.net/Bios/SteveCook.aspx) in 2013)
  - [MDA Journal January 2004](http://www.bptrends.com/publicationfiles/01-04%20COL%20Dom%20Spec%20Modeling%20Frankel-Cook.pdf)

- **Dave Thomas**
  - [Column about UML (2003)](http://www.jot.fm/issues/issue_2003_01/column1/)


# Design

## Fundamentals

1. **For Developers**; the target audience / users are developers, software developers with skills in structuring, modelling data and objects and automating things.
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

Too bad C4 modelling implemented in [structurizr](https://structurizr.com/) is based on services Structurizr provides. It would be better if this would have been open source <span class="yellow">[research: or is it open source ... ?]</span>

## Examples

- [Land Administration System](land-administration-system)

## Local Development Environment

- [VSCode] (by `choco install vscode`) with extensions:
  - [jebbs.plantuml] with configuration to use `server` with public [plantuml server](https://www.plantuml.com/plantuml)

<style type="text/css">
yellow {
    background-color: yellow;
}
</style>