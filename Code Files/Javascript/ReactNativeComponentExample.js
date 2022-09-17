import React from "react";
import { Text, View } from 'react-native';

const TextComponent = (props) => {
    return(
        <View>
            <Text>{props.text}</Text>
        </View>
    )
}

export default TextComponent;