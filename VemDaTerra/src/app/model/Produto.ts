import {Categoria} from "./Categoria"
import {User} from "./User"

export class Produto{
    public id: number
    public nome: string
    public descricao: string
    public preco: number
    public codigo: number
    public url: string
    public categoria: Categoria
    public usuario: User[]

}