variable "amis" {
  type = map(string)

  default = {
    "us-east-1" = "ami-052efd3df9dad4825"
    "us-east-2" = "ami-02f3416038bdb17fb"
  }
}

variable "cdirs_acesso_remoto" {
  type = list(string)

  default = [ "187.72.95.177/32" ]
}

variable "key_name" {
  type = string
  default = "terraform-aws"
}