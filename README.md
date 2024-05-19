# Less Entropy

A simple spigot plugin to prevent ender dragons from breaking blocks, significantly reduce endermen block interactions, and reduce pigmen spawns from nether portals. It also allows custom overworld return locations for entities tossed into the end portal. All three features are configurable.

## Configuring

`plugins/LessEntropy/config.yml`:

```yaml
enderman-block-pickup-chance: 0.075
dragon-block-break-chance: 0.0
portal-spawn-chance: 0.1
end-return-portal-destination:
  ==: org.bukkit.Location
  world: world
  x: 5.5
  y: 64.00
  z: 5.5
  pitch: 0.0
  yaw: -90.0
```

## Building

```shell
./gradlew build
```

## License

Licensed under GPLv3

Copyright (c) 2021 lordpipe

### Contributing

By making a contribution to this repository, I certify that:

* (a) The contribution was created in whole or in part by me and I have the right to submit it under the open source license indicated in the file; or
* (b) The contribution is based upon previous work that, to the best of my knowledge, is covered under an appropriate open source license and I have the right under that license to submit that work with modifications, whether created in whole or in part by me, under the same open source license (unless I am permitted to submit under a different license), as indicated in the file; or
* (c) The contribution was provided directly to me by some other person who certified (a), (b) or (c) and I have not modified it.
* I understand and agree that this project and the contribution are public and that a record of the contribution (including all personal information I submit with it, including my sign-off) is maintained indefinitely and may be redistributed consistent with this project or the open source license(s) involved.
