# Joining the Platform [WIP]

> {.note}
> The following page is not complete and should not be reviewed. There
> is a lot missing and its structure will change.

When the Committee has incubated your project, the Process lead subscribes
you to all the Platform services and you start benefiting from its tools
and infrastructure right away.

The Scala Center strives to make this process as easy as possible,
and let you focus on the truly hard tasks: building a community,
tooling, growing your module, and fixing bugs. For that, we provide a
simple step-by-step tutorial to help you migrate.

## Continuous Integration servers

Our Drone servers provide quick development experience to module maintainers.
With 48 cores and 64 gigabytes of memory, we ensure that PRs are built fast and that the
turnaround is short.

Here are the steps for setting up the CI:

1. Go to [our Drone setup](http://stats.lassie.io:8001).
2. Log in with your GitHub credentials and turn on the CI in your module.
3. Push a `drone.yml` file with the build logic and see the CI kicking in.

If you're using Travis, follow [this guide](http://github.com/scalaplatform/) to find out
the most straightforward way to translate the configuration logic.

> {.warning}
> From the CI web interface you can add [secrets](http://readme.drone.io/usage/secrets/)
> to store sensitive data (e.g. passwords).

## Default module template

The [default module template](https://github.com/scalaplatform) showcases the use of the Platform infrastructure.
Check the commit history to get a feeling of the changes required to make it work.

## SBT release plugin

Our release process encourages "release early, release often" practices.
Developers and companies using older versions want to migrate and test their code as soon
as possible, and reproducible versions make it easier for them to adopt a new version.

The `platform-release` sbt plugin provides a default release pipeline that automates
*MiMa* checks, tags management, GitHub release creation, jar upload. This default
pipeline is key for the release of *NIGHTLY*s and *BETA*s.

## Release bot

Once you have set up the CI and the sbt release plugin, the release bot builds, tests and
releases your module every night, following [the release model explained in the process](policies.md#release).

Remember that the release bot takes the latest changes in the `plaform-release` branch and
publishes them. Instead of using latest master, we prefer module maintainers manually push to
`platform-release` when they feel comfortable enough with the changes.
Manual intervention is deliberate, it prevents breaking compatibility and allows maintainers to
to handle versioning as they prefer.

