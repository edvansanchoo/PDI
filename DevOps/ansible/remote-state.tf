terraform {
  backend "remote" {
    hostname = "app.terraform.io"
    organization = "edvan-pdi"

    workspaces {
      name = "aws-pdi"
    }
  }
}