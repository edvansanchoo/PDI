package br.com.project.rh.model;

public enum Cargo {
    ASSITENTE{
        @Override
        public Cargo getProximoCargo() {
            return ANALISTA;
        }
    },
    ANALISTA {
        @Override
        public Cargo getProximoCargo() {
            return ESPECIALISTA;
        }
    },
    ESPECIALISTA {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    },
    GERENTE {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    };

    public abstract Cargo getProximoCargo();
}
