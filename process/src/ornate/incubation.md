# Incubation

## Why is it necessary?

The incubation process is key for the development of a module. It's the call for
action for those who want to get involved and help out in its evolution. While
some Platform modules with a strong presence in the Community may not need to get
contributors, polish docs, and prepare for a stable release, the incubation period
helps the maintainers to get a feeling of the process and increase their userbase.

## Duration

The duration of the incubation is recommended on a case-by-case basis by the Scala
Platform Committee. Module maintainers can, however, ask for a review whenever they
feel ready. Module maintainers are encouraged to ask for advice to their assigned
reviewer before asking for the official review.

The incubation process can last, at maximum, six months.

Modules are merged when they:
*  Have passed their incubation period;
*  Have *at least* one committer cutting releases and maintaining them; and,
*  Abide by the Code of Conduct.

## Starting the incubation

When the Committee decides to incubate your project, the Process lead
will add the current module maintainers to the [`scalaplatform` GitHub organization](https://github.com/scalaplatform).

## The infrastructure

The incubation process and the integration with the infrastructure
is meant to be as easy as possible, so that you can focus on the hard tasks:
* Growing your community;
* Tooling around your project;
* Fixing bugs;
* Preparing for a release.

> {.note}
> Given the compatibility requirements defined in the Platform release process, it
> is very important that the public API of an incubated module has seen several iterations
> before a stable release, and is stable enough to last for 18 months.

As an incubated project, you have access to all the Scala Platform infrastructure.

The infrastructure consists of:

1. Continuous Integration servers.
1. The Platform sbt release plugin.
1. The nightly release bot.
