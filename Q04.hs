main :: IO ()
main = do
    putStrLn "Qual a sua idade:"
    input <- getLine
    let idade = read input :: Int

    if idade >= 0 && idade <18 
    then do putStrLn "Você é menor de idade."
    else if idade >= 18 
    then do putStrLn "Você é maior de idade."
    else do putStrLn "Inválido."