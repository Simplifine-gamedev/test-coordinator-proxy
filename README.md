# Test Coordinator Proxy

A Minecraft Fabric 1.21.1 mod that adds a powerful **Diamond Apple** item to the game.

## Features

The Diamond Apple is an enhanced food item that provides powerful status effects when consumed:

- **Nutrition**: 8 hunger points
- **Saturation**: 1.2 modifier (excellent saturation)
- **Always Edible**: Can be eaten even when hunger bar is full

### Status Effects

When consumed, the Diamond Apple grants:

| Effect | Duration | Level |
|--------|----------|-------|
| Regeneration | 30 seconds | III |
| Resistance | 5 minutes | II |
| Fire Resistance | 5 minutes | I |
| Absorption | 2 minutes | V |
| Strength | 2 minutes | II |

## How to Use

1. Obtain the Diamond Apple using the `/give` command:
   ```
   /give @p test-coordinator-proxy:diamond_apple
   ```

2. The item appears in the Food & Drink creative tab

3. Right-click to eat the apple and receive all status effects

4. Stack size: 64 (like regular apples)

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.16.0+
- Fabric API

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.21.1
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) and place it in your `mods` folder
3. Download the latest release of this mod from the releases page
4. Place the mod JAR file in your `mods` folder
5. Launch Minecraft with the Fabric profile

## Building from Source

```bash
git clone https://github.com/Simplifine-gamedev/test-coordinator-proxy.git
cd test-coordinator-proxy
./gradlew build
```

The built JAR will be located in `build/libs/`

## Item Details

- **Item ID**: `test-coordinator-proxy:diamond_apple`
- **Display Name**: Diamond Apple
- **Category**: Food & Drink

## License

This mod is provided as-is for use in Minecraft gameplay.

---

Created by ali77sina
