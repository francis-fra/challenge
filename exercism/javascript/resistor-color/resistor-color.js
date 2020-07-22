const color_map = new Map([ ["black",0],
                            ["brown",1], 
                            ["red",2],
                            ["orange",3],
                            ["yellow",4],
                            ["green",5],
                            ["blue",6],
                            ["violet",7],
                            ["grey",8],
                            ["white", 9]
                           ]);

export const COLORS = Array.from(color_map.keys());

export const colorCode = (color) => {
    return color_map.get(color);
};

