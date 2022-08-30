# Antisplash

I have a splashes.txt, full of custom text, and mods don't let you disable the custom splashes that *they* add. Why can I not disable them??? Oh, I know, I need a mod for... mods, that disables them from modding Minecraft!

Currently supported mods are: [Interference](https://github.com/magistermaks/mod-interference), and [Lib39](https://git.sleeping.town/unascribed/Lib39).

If you come across a mod that adds splashes with *no* way of disabling them, let me know.

## Installation and Usage

To build Antisplash once, run `./gradlew --no-daemon build` in a POSIX compliant shell. The mod jar will be at `build/libs/`.

Antisplash is a standalone nilmod, that means it has [NilLoader](https://git.sleeping.town/unascribed/NilLoader) embbed into it, and it can be used the same was as the loader is. If you don't have NilLoader, installation is the same as NilLoader itself: add `-javaagent:'/path/to/Antisplash-1.0.jar'` to your Java arguments.

If you have NilLoader installed by itself, you can simply place it in the `mods/` or `nilmods/` folder.
