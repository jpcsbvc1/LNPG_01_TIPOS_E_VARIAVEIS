main :: IO ()
main = do
    putStrLn "Quantos graus celsius esta sua cidade?"
    input <- getLine
    let celsius = read input :: Float

    let fahrenheit = celsius * 1.8 + 32
    putStrLn("A temperatura em Fahrenheit é: " ++ show fahrenheit)