# Colorize
Colorize Library for Java based on Fazibear's Colorize gem for Ruby

## Usage

### Colors

Colors |
-------
Red |
GREEN |
YELLOW |
BLUE |
PURPLE |
CYAN |
GRAY |
BRIGHT_RED |
BRIGHT_GREEN |
BRIGHT_YELLOW |
BRIGHT_BLUE |
BRIGHT_MAGENTA |
BRIGHT_CYAN |
RESET |

### Backgrounds

Backgrounds |
-----------
BLACK |
RED |
GREEN |
YELLOW |
BLUE |
PURPLE |
CYAN |
WHITE |


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
