# Colorize
Colorize Library for Java based on Fazibear's Colorize gem for Ruby

## Description
Allows for displaying colored text and colored highlighting on a console/command-line. Tested on Windows Terminal (Powershell and Ubuntu/WSL).

## Usage

### Colors

|Colors |
|-------|
| RED |
| GREEN |
| YELLOW |
| BLUE |
| PURPLE |
| CYAN |
| GRAY |
| BRIGHT_RED |
| BRIGHT_GREEN |
| BRIGHT_YELLOW |
| BRIGHT_BLUE |
| BRIGHT_MAGENTA |
| BRIGHT_CYAN |
| RESET |

### Backgrounds

| Backgrounds |
| ----------- |
| BLACK |
| RED |
| GREEN |
| YELLOW |
| BLUE |
| PURPLE |
| CYAN |
| WHITE |

### Notes

RESET color can be used reset colors/background back to default. Though, `colorize()` takes care of reseting back to default after applying the styling ot the given text.

### Methods

#### `colorize(String string, COLORS color)`
Color a given a String with specified color.

#### `colorize(String string, BACKGROUNDS background)`
Highlight a given String with specified background.

#### `colorize(String string, COLORS color, BACKGROUNDS background)`
Color and highlight a given String with specified color and background.

### Examples
```
public static void main(String[] args) {
    
    // Print out a colored String
    System.out.println(Colorize.colorize("Hello World -- Colored", Colorize.COLORS.BLUE));

    // Print out a String with a colored background
    System.out.println(Colorize.colorize("Hello World -- Blue Background", Colorize.BACKGROUNDS.BLUE));

    // Print out a colored String with colored background
    System.out.println(Colorize.colorize("Hello World -- Colored String and Colored Background", Colorize.COLORS.BLUE, Colorize.BACKGROUNDS.WHITE));
}
```

#### With Lombok's Extension Method
```
@ExtensionMethod({Colorize.class})
public class Test {
    ...
    public static void main(String[] args) {
        // Print out a colored String
    System.out.println("Hello World -- Colored".colorize(Colorize.COLORS.BLUE));

    // Print out a String with a colored background
    System.out.println("Hello World -- Blue Backgroun   d".colorize(Colorize.BACKGROUNDS.BLUE));

    // Print out a colored String with colored background
    System.out.println("Hello World -- Colored String and Colored Background".colorize(Colorize.COLORS.BLUE, Colorize.BACKGROUNDS.WHITE));
    }
}
```
