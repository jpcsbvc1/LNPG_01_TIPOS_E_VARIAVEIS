main :: IO ()
main = do
    putStrLn "Digite um número inteiro:"
    input <- getLine
    let numeroUm = read input :: Int
    putStrLn "Digite outro número inteiro:"
    input <- getLine
    let numeroDois = read input :: Int

    let soma = numeroUm + numeroDois 
    let subtração = numeroUm - numeroDois
    let multiplicação = numeroUm * numeroDois
    let divisão = fromIntegral numeroUm / fromIntegral numeroDois

    putStrLn ("Soma: " ++ show soma)
    putStrLn ("Subtração: " ++ show subtração)
    putStrLn ("Multiplicação: " ++ show multiplicação)
    putStrLn ("Divisão: " ++ show divisão)
    