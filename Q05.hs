main :: IO ()
main = do
    putStrLn "Digite sua primeira nota:"
    input <- getLine
    let notaUm = read input :: Float
    putStrLn "Digite o peso da nota:"
    input <- getLine
    let pesoUm = read input :: Float
    putStrLn "Digite sua segunda nota:"
    input <- getLine
    let notaDois = read input :: Float
    putStrLn "Digite o peso da nota:"
    input <- getLine
    let pesoDois = read input :: Float
    putStrLn "Digite a terceira nota:"
    input <- getLine
    let notaTres = read input :: Float
    putStrLn "Digite o peso da nota:"
    input <- getLine
    let pesoTres = read input :: Float
    
    let médiaPonderada = ((notaUm * pesoUm) + (notaDois * pesoDois) + (notaTres * pesoTres)) / (pesoUm + pesoDois + pesoTres)

    putStrLn ("Média ponderada: " ++ show médiaPonderada)
    