main :: IO ()
main = do
    putStrLn "Digite um inteiro:"
    input <- getLine
    let inteiro = read input :: Int

    if inteiro `mod` 2 == 0 
    then do putStrLn "O número é par."
    else if inteiro `mod` 2 == 1 
    then do putStrLn "O número é ímpar."
    else do putStrLn "Inválido."