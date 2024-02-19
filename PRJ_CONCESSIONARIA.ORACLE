-- Gerado por Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   em:        2023-10-14 23:51:30 BRT
--   site:      Oracle Database 21c
--   tipo:      Oracle Database 21c



CREATE BIGFILE TABLESPACE data_tablespace
    DATAFILE 'C:\APP\JPVCH\PRODUCT\21C\DBHOMEXE\DATABASE\DATA01.DAT' SIZE 5222400K REUSE
    AUTOEXTEND ON NEXT 1280000K MAXSIZE UNLIMITED
LOGGING ONLINE DEFAULT NOCOMPRESS NO INMEMORY
    EXTENT MANAGEMENT LOCAL AUTOALLOCATE
FLASHBACK ON 
;

CREATE BIGFILE TABLESPACE index_tablespace
    DATAFILE 'C:\APP\JPVCH\PRODUCT\21C\DBHOMEXE\DATABASE\INDEX01.DAT' SIZE 2764800K REUSE
    AUTOEXTEND ON NEXT 691200K MAXSIZE UNLIMITED
LOGGING ONLINE DEFAULT NOCOMPRESS NO INMEMORY
    EXTENT MANAGEMENT LOCAL AUTOALLOCATE
FLASHBACK ON 
;

CREATE SMALLFILE UNDO TABLESPACE undotbs1
    DATAFILE 'C:\APP\JPVCH\PRODUCT\21C\ORADATA\XE\UNDOTBS01.DBF' SIZE 117760K REUSE
    AUTOEXTEND ON NEXT 5120K MAXSIZE UNLIMITED
    EXTENT MANAGEMENT LOCAL
    RETENTION NOGUARANTEE;


CREATE PROFILE PRO_COLABORADORES LIMIT
    FAILED_LOGIN_ATTEMPTS 2
    PASSWORD_LOCK_TIME 5/1440
    PASSWORD_LIFE_TIME 30
    PASSWORD_GRACE_TIME 7
    PASSWORD_REUSE_TIME 60
    PASSWORD_REUSE_MAX 10
    PASSWORD_VERIFY_FUNCTION DEFAULT
    SESSIONS_PER_USER UNLIMITED
    CONNECT_TIME UNLIMITED 
    IDLE_TIME 10
    CPU_PER_SESSION UNLIMITED
    LOGICAL_READS_PER_SESSION DEFAULT
    COMPOSITE_LIMIT UNLIMITED
    CPU_PER_CALL 30000
    LOGICAL_READS_PER_CALL 100;

CREATE PROFILE PRO_FORNECEDORES LIMIT
    FAILED_LOGIN_ATTEMPTS 2
    PASSWORD_LOCK_TIME 15/1440
    PASSWORD_LIFE_TIME 10
    PASSWORD_GRACE_TIME 8
    PASSWORD_REUSE_TIME 75
    PASSWORD_REUSE_MAX 15
    PASSWORD_VERIFY_FUNCTION DEFAULT
    SESSIONS_PER_USER UNLIMITED
    CONNECT_TIME UNLIMITED 
    IDLE_TIME 10
    CPU_PER_SESSION UNLIMITED
    LOGICAL_READS_PER_SESSION DEFAULT
    COMPOSITE_LIMIT UNLIMITED
    CPU_PER_CALL 20000
    LOGICAL_READS_PER_CALL 75;

CREATE PROFILE PRO_CLIENTES LIMIT
    FAILED_LOGIN_ATTEMPTS 2
    PASSWORD_LOCK_TIME 45/1440
    PASSWORD_LIFE_TIME 10
    PASSWORD_GRACE_TIME 14
    PASSWORD_REUSE_TIME 90
    PASSWORD_REUSE_MAX 15
    PASSWORD_VERIFY_FUNCTION DEFAULT
    SESSIONS_PER_USER UNLIMITED
    CONNECT_TIME UNLIMITED 
    IDLE_TIME UNLIMITED
    CPU_PER_SESSION UNLIMITED
    LOGICAL_READS_PER_SESSION DEFAULT
    COMPOSITE_LIMIT UNLIMITED
    CPU_PER_CALL 15000
    LOGICAL_READS_PER_CALL 50;

CREATE ROLE prj_concessionaria NOT IDENTIFIED;

CREATE ROLE ro_carros NOT IDENTIFIED;

CREATE ROLE ro_clientes NOT IDENTIFIED;

CREATE ROLE ro_clientesatb NOT IDENTIFIED;

GRANT ro_clientes TO ro_clientesatb;

CREATE ROLE ro_colaboradores NOT IDENTIFIED;

CREATE ROLE ro_concessionarias NOT IDENTIFIED;

CREATE ROLE ro_conserto NOT IDENTIFIED;

CREATE ROLE ro_fornecedores NOT IDENTIFIED;

CREATE ROLE ro_fornecedoresatb NOT IDENTIFIED;

GRANT ro_fornecedores TO ro_fornecedoresatb;

CREATE ROLE ro_gerentes NOT IDENTIFIED;

GRANT ro_concessionarias, ro_colaboradores TO ro_gerentes;

CREATE ROLE ro_pecas NOT IDENTIFIED;

CREATE ROLE ro_vendas NOT IDENTIFIED;

CREATE ROLE ro_vendedores NOT IDENTIFIED;

GRANT ro_vendas, ro_carros, ro_colaboradores TO ro_vendedores;

CREATE ROLE ro_mecanicos NOT IDENTIFIED;

GRANT ro_carros, ro_pecas, ro_colaboradores, ro_conserto TO ro_mecanicos;

CREATE USER bill001 IDENTIFIED BY DEFAULT TABLESPACE USERS PROFILE PRO_COLABORADORES ACCOUNT UNLOCK ;

GRANT RO_MECANICOS TO BILL001 
;

CREATE USER chico001 IDENTIFIED BY DEFAULT TABLESPACE USERS PROFILE PRO_COLABORADORES ACCOUNT UNLOCK ;

GRANT RO_VENDEDORES TO CHICO001 
;

CREATE USER faustao001 IDENTIFIED BY DEFAULT TABLESPACE USERS PROFILE PRO_CLIENTES ACCOUNT UNLOCK ;

GRANT RO_CLIENTESATB TO FAUSTAO001 
;

CREATE USER manoelgomes001 IDENTIFIED BY DEFAULT TABLESPACE USERS PROFILE PRO_COLABORADORES ACCOUNT UNLOCK ;

GRANT RO_GERENTES TO MANOELGOMES001 
;

CREATE USER prj_concessionaria 
    IDENTIFIED BY  
    DEFAULT TABLESPACE USERS 
    PROFILE DEFAULT 
    ACCOUNT UNLOCK 
;

GRANT SELECT
    any
    transaction, unlimited
    tablespace
    to
        prj_concessionaria;

CREATE USER sys IDENTIFIED BY profile DEFAULT 
    ACCOUNT UNLOCK 
;

GRANT RO_CARROS,RO_FORNECEDORES,RO_CLIENTESATB,RO_VENDEDORES,RO_COLABORADORES,RO_CLIENTES,RO_PECAS,RO_GERENTES,RO_VENDAS,RO_CONSERTO,RO_FORNECEDORESATB,RO_MECANICOS,RO_CONCESSIONARIAS TO SYS  WITH ADMIN OPTION
;

GRANT ALTER ANY ANALYTIC VIEW, DROP ANY HIERARCHY, LOGMINING, DROP LOCKDOWN PROFILE, INHERIT ANY PRIVILEGES, CREATE ANY MEASURE FOLDER, DROP ANY CUBE, DROP ANY ASSEMBLY, MANAGE ANY FILE GROUP, DROP ANY SQL PROFILE, DEBUG CONNECT SESSION, ON COMMIT REFRESH, CREATE OPERATOR, DROP ANY VIEW, CREATE VIEW, CREATE PUBLIC SYNONYM, DROP ANY CLUSTER, ALTER USER, SELECT ANY CUBE BUILD PROCESS, CREATE LOCKDOWN PROFILE, FLASHBACK ARCHIVE ADMINISTER, DROP ANY CUBE BUILD PROCESS, CREATE CUBE BUILD PROCESS, DROP ANY MEASURE FOLDER, SELECT ANY CUBE DIMENSION, EXECUTE ASSEMBLY, ALTER ANY EDITION, SELECT ANY TRANSACTION, FLASHBACK ANY TABLE, UNDER ANY VIEW, CREATE ANY INDEXTYPE, CREATE ANY OPERATOR, EXECUTE ANY TYPE, CREATE PROFILE, DROP ANY TRIGGER, DROP PUBLIC DATABASE LINK, CREATE ANY VIEW, DROP PUBLIC SYNONYM, DROP ANY SYNONYM, DROP ANY INDEX, CREATE CLUSTER, DROP USER, UNLIMITED TABLESPACE, CREATE ANALYTIC VIEW, DROP ANY ATTRIBUTE DIMENSION, CREATE ANY CREDENTIAL, EM EXPRESS CONNECT, DELETE ANY MEASURE FOLDER, UPDATE ANY CUBE, DELETE ANY CUBE DIMENSION, CREATE CUBE DIMENSION, CHANGE NOTIFICATION, ADMINISTER ANY SQL TUNING SET, CREATE JOB, IMPORT FULL DATABASE, RESUMABLE, ALTER ANY OUTLINE, DROP ANY DIMENSION, CREATE ANY DIMENSION, CREATE INDEXTYPE, CREATE ANY LIBRARY, DROP ANY DIRECTORY, CREATE ANY DIRECTORY, CREATE MATERIALIZED VIEW, ALTER DATABASE, GRANT ANY ROLE, DROP ANY ROLE, CREATE ANY SEQUENCE, DELETE ANY TABLE, DROP ANY ANALYTIC VIEW, EXECUTE DYNAMIC MLE, USE ANY JOB RESOURCE, CREATE CREDENTIAL, ALTER LOCKDOWN PROFILE, SELECT ANY CUBE, CREATE CUBE, DROP ANY CUBE DIMENSION, CREATE ANY ASSEMBLY, CREATE ASSEMBLY, READ ANY FILE GROUP, MANAGE FILE GROUP, EXPORT FULL DATABASE, GRANT ANY OBJECT PRIVILEGE, GLOBAL QUERY REWRITE, ALTER ANY LIBRARY, CREATE TYPE, ALTER ANY MATERIALIZED VIEW, CREATE ANY TRIGGER, CREATE PROCEDURE, FORCE TRANSACTION, CREATE SEQUENCE, CREATE SYNONYM, INSERT ANY TABLE, ALTER ANY TABLE, DROP ROLLBACK SEGMENT, DROP TABLESPACE, MANAGE TABLESPACE, ALTER SESSION, CREATE ATTRIBUTE DIMENSION, USE ANY SQL TRANSLATION PROFILE, UPDATE ANY CUBE BUILD PROCESS, CREATE MEASURE FOLDER, ALTER ANY CUBE, MANAGE SCHEDULER, EXECUTE ANY PROGRAM, ADMINISTER DATABASE TRIGGER, UNDER ANY TABLE, ALTER ANY INDEXTYPE, DROP ANY OPERATOR, ALTER ANY OPERATOR, DROP ANY LIBRARY, CREATE LIBRARY, UNDER ANY TYPE, ALTER ANY TYPE, CREATE ANY TYPE, CREATE ANY MATERIALIZED VIEW, ALTER ANY TRIGGER, CREATE TRIGGER, ALTER ANY PROCEDURE, CREATE ANY PROCEDURE, CREATE PUBLIC DATABASE LINK, SELECT ANY SEQUENCE, DROP ANY SEQUENCE, CREATE ANY SYNONYM, DROP ANY TABLE, ALTER ROLLBACK SEGMENT, CREATE USER, ALTER TABLESPACE, AUDIT SYSTEM, ALTER SYSTEM, DROP LOGICAL PARTITION TRACKING, ALTER ANY HIERARCHY, CREATE HIERARCHY, ALTER ANY MEASURE FOLDER, CREATE ANY SQL TRANSLATION PROFILE, CREATE ANY CUBE BUILD PROCESS, CREATE ANY CUBE, CREATE ANY MINING MODEL, EXECUTE ANY ASSEMBLY, ALTER ANY ASSEMBLY, CREATE ANY EDITION, CREATE EXTERNAL JOB, EXECUTE ANY CLASS, CREATE ANY JOB, DEBUG ANY PROCEDURE, MERGE ANY VIEW, DROP ANY CONTEXT, EXECUTE ANY INDEXTYPE, ALTER RESOURCE COST, DROP PROFILE, ALTER PROFILE, EXECUTE ANY PROCEDURE, FORCE ANY TRANSACTION, AUDIT ANY, ALTER ANY ROLE, CREATE ANY CLUSTER, COMMENT ANY TABLE, CREATE ANY TABLE, CREATE TABLE, CREATE TABLESPACE, CREATE ANY ANALYTIC VIEW, CREATE ANY ATTRIBUTE DIMENSION, READ ANY TABLE, SELECT ANY MEASURE FOLDER, DROP ANY SQL TRANSLATION PROFILE, ALTER ANY SQL TRANSLATION PROFILE, UPDATE ANY CUBE DIMENSION, INSERT ANY MEASURE FOLDER, CREATE ANY CUBE DIMENSION, ALTER ANY CUBE DIMENSION, ALTER ANY MINING MODEL, DROP ANY MINING MODEL, DROP ANY EDITION, ADMINISTER SQL TUNING SET, ALTER ANY SQL PROFILE, ADMINISTER RESOURCE MANAGER, DROP ANY OUTLINE, ALTER ANY DIMENSION, CREATE DIMENSION, QUERY REWRITE, EXECUTE ANY LIBRARY, GRANT ANY PRIVILEGE, CREATE ROLE, ALTER ANY SEQUENCE, ALTER ANY CLUSTER, REDEFINE ANY TABLE, LOCK ANY TABLE, BACKUP ANY TABLE, CREATE LOGICAL PARTITION TRACKING, CREATE ANY HIERARCHY, ALTER ANY ATTRIBUTE DIMENSION, ALTER ANY CUBE BUILD PROCESS, SET CONTAINER, CREATE PLUGGABLE DATABASE, CREATE SQL TRANSLATION PROFILE, ADMINISTER SQL MANAGEMENT OBJECT, INSERT ANY CUBE DIMENSION, COMMENT ANY MINING MODEL, SELECT ANY MINING MODEL, CREATE MINING MODEL, CREATE ANY SQL PROFILE, ADVISOR, DEBUG CONNECT ANY, CREATE ANY OUTLINE, CREATE ANY CONTEXT, DROP ANY INDEXTYPE, EXECUTE ANY OPERATOR, DROP ANY TYPE, DROP ANY MATERIALIZED VIEW, ANALYZE ANY, DROP ANY PROCEDURE, CREATE DATABASE LINK, ALTER ANY INDEX, CREATE ANY INDEX, UPDATE ANY TABLE, CREATE ROLLBACK SEGMENT, BECOME USER, RESTRICTED SESSION, CREATE SESSION TO SYS 
;

GRANT ALTER ANY RULE,
    CREATE RULE,
    EXECUTE ANY RULE SET,
    CREATE ANY RULE SET,
    DROP ANY RULE,
    CREATE RULE SET,
    EXECUTE ANY RULE,
    CREATE ANY RULE,
    ALTER ANY EVALUATION CONTEXT,
    CREATE ANY EVALUATION CONTEXT,
    ALTER ANY RULE SET,
    DROP ANY EVALUATION CONTEXT,
    ENQUEUE ANY QUEUE,
    DROP ANY RULE SET,
    EXECUTE ANY EVALUATION CONTEXT,
    DEQUEUE ANY QUEUE,
    CREATE EVALUATION CONTEXT,
    MANAGE ANY QUEUE, SELECT ANY TABLE TO SYS  WITH ADMIN OPTION
;

CREATE USER zeca001 IDENTIFIED BY DEFAULT TABLESPACE USERS PROFILE PRO_FORNECEDORES ACCOUNT UNLOCK ;

GRANT RO_FORNECEDORESATB TO ZECA001 
;

-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE OR REPLACE DIRECTORY dpump_dir1 AS 'C:\app\jpvch\product\21c\dbhomeXE\database\datapump';

GRANT READ, WRITE ON DIRECTORY dpump_dir1 TO prj_concessionaria;

GRANT DATAPUMP_EXP_FULL_DATABASE, DATAPUMP_IMP_FULL_DATABASE TO PRJ_CONCESSIONARIA;

CREATE SEQUENCE prj_concessionaria.cli_id_cli_seq INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20;

CREATE SEQUENCE prj_concessionaria.cons_id_cons_seq INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 NOCACHE ORDER;

CREATE SEQUENCE prj_concessionaria.vendas_id_vendas_seq INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20;

CREATE TABLE prj_concessionaria.carros (
    id_car         NUMBER(5)
        CONSTRAINT nn_car_id NOT NULL,
    num_placa_car  CHAR(7 BYTE)
        CONSTRAINT nn_car_plac NOT NULL,
    nom_modelo_car VARCHAR2(50 BYTE)
        CONSTRAINT nn_car_mdl NOT NULL,
    num_ano_car    NUMBER(4)
        CONSTRAINT nn_car_ano NOT NULL,
    nom_cor_car    VARCHAR2(20 BYTE)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

ALTER TABLE prj_concessionaria.carros
    ADD CONSTRAINT ck_car_ano CHECK ( "NUM_ANO_CAR" >= 2014
                                      AND "NUM_ANO_CAR" <= 2024 );

CREATE UNIQUE INDEX prj_concessionaria.pk_car ON
    prj_concessionaria.carros (
        id_car
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.un_car_plac ON
    prj_concessionaria.carros (
        num_placa_car
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.carros TO ro_carros;

GRANT SELECT ON prj_concessionaria.carros TO ro_clientes;

ALTER TABLE prj_concessionaria.carros
    ADD CONSTRAINT pk_car PRIMARY KEY ( id_car )
        USING INDEX prj_concessionaria.pk_car;

ALTER TABLE prj_concessionaria.carros
    ADD CONSTRAINT un_car_plac UNIQUE ( num_placa_car )
        USING INDEX prj_concessionaria.un_car_plac;

CREATE TABLE prj_concessionaria.clientes (
    id_cli        NUMBER(5)
        CONSTRAINT nn_cli_id_cli NOT NULL,
    num_cpf_cli   CHAR(14 BYTE)
        CONSTRAINT nn_cli_cpf NOT NULL,
    nom_cli       VARCHAR2(100 BYTE)
        CONSTRAINT nn_cli_nome NOT NULL,
    num_idade_car NUMBER(2)
        CONSTRAINT nn_cli_ida NOT NULL,
    nom_email_cli VARCHAR2(50 BYTE),
    num_tel_cli   CHAR(11 BYTE),
    nom_ender_cli VARCHAR2(50 BYTE)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

ALTER TABLE prj_concessionaria.clientes ADD CONSTRAINT clientes_chk1 CHECK ( "NUM_IDADE_CAR" >= 18 );

CREATE UNIQUE INDEX prj_concessionaria.pk_cli ON
    prj_concessionaria.clientes (
        id_cli
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.un_cli_cpf ON
    prj_concessionaria.clientes (
        num_cpf_cli
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE prj_concessionaria.clientes
    ADD CONSTRAINT pk_cli PRIMARY KEY ( id_cli )
        USING INDEX prj_concessionaria.pk_cli;

ALTER TABLE prj_concessionaria.clientes
    ADD CONSTRAINT un_cli_cpf UNIQUE ( num_cpf_cli )
        USING INDEX prj_concessionaria.un_cli_cpf;

CREATE TABLE prj_concessionaria.colaboradores (
    id_colab                            NUMBER(5)
        CONSTRAINT nn_colab_id NOT NULL,
    concessionarias_cod_concessionarias NUMBER(5)
        CONSTRAINT nn_colab_concd NOT NULL,
    num_cpf_colab                       CHAR(14 BYTE)
        CONSTRAINT nn_colab_cpf NOT NULL,
    nom_colab                           VARCHAR2(100 BYTE)
        CONSTRAINT nn_colab_nome NOT NULL,
    num_idade_colab                     NUMBER(2)
        CONSTRAINT nn_colab_ida NOT NULL,
    nom_email_colab                     VARCHAR2(50 BYTE),
    num_tel_colab                       CHAR(11 BYTE),
    nom_ender_colab                     VARCHAR2(50 BYTE),
    val_salario_colab                   FLOAT(8)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

ALTER TABLE prj_concessionaria.colaboradores ADD CONSTRAINT colaboradores_chk1 CHECK ( "NUM_IDADE_COLAB" >= 18 );

CREATE INDEX prj_concessionaria.idx_colab_concd_fk_conc_colab ON
    prj_concessionaria.colaboradores (
        concessionarias_cod_concessionarias
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.pk_colab ON
    prj_concessionaria.colaboradores (
        id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.un_colab_cpf ON
    prj_concessionaria.colaboradores (
        num_cpf_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.colaboradores TO ro_colaboradores;

ALTER TABLE prj_concessionaria.colaboradores
    ADD CONSTRAINT pk_colab PRIMARY KEY ( id_colab )
        USING INDEX prj_concessionaria.pk_colab;

ALTER TABLE prj_concessionaria.colaboradores
    ADD CONSTRAINT un_colab_cpf UNIQUE ( num_cpf_colab )
        USING INDEX prj_concessionaria.un_colab_cpf;

CREATE TABLE prj_concessionaria.concessionarias (
    cod_concessionarias             NUMBER(3)
        CONSTRAINT nn_conc_codcn NOT NULL,
    gerentes_colaboradores_id_colab NUMBER(5)
        CONSTRAINT nn_conc_gerid NOT NULL,
    num_cnpj_conc                   CHAR(19 BYTE)
        CONSTRAINT nn_conc_cnpj NOT NULL,
    nom_conc                        VARCHAR2(100 BYTE)
        CONSTRAINT nn_conc_nome NOT NULL,
    nom_ender_conc                  VARCHAR2(50 BYTE),
    num_tel_conc                    CHAR(11 BYTE),
    qtd_func_conc                   NUMBER(3)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_conc_gerid_fk_ger_conc ON
    prj_concessionaria.concessionarias (
        gerentes_colaboradores_id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.pk_conc ON
    prj_concessionaria.concessionarias (
        cod_concessionarias
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.un_conc_cnpj ON
    prj_concessionaria.concessionarias (
        num_cnpj_conc
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.concessionarias TO ro_concessionarias;

ALTER TABLE prj_concessionaria.concessionarias
    ADD CONSTRAINT pk_conc PRIMARY KEY ( cod_concessionarias )
        USING INDEX prj_concessionaria.pk_conc;

ALTER TABLE prj_concessionaria.concessionarias
    ADD CONSTRAINT un_conc_cnpj UNIQUE ( num_cnpj_conc )
        USING INDEX prj_concessionaria.un_conc_cnpj;

CREATE TABLE prj_concessionaria.conserto (
    id_cons                          NUMBER(5)
        CONSTRAINT nn_cons_id NOT NULL,
    carros_id_car                    NUMBER(5)
        CONSTRAINT nn_cons_carid NOT NULL,
    clientes_id_cli                  NUMBER(5)
        CONSTRAINT nn_cons_cliid NOT NULL,
    mecanicos_colaboradores_id_colab NUMBER(5)
        CONSTRAINT nn_cons_mecid NOT NULL,
    nom_tipo_cons                    VARCHAR2(25 BYTE),
    num_cust_cons                    FLOAT(6)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_cons_carid_fk_car_cons ON
    prj_concessionaria.conserto (
        carros_id_car
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_cons_cliid_fk_cli_cons ON
    prj_concessionaria.conserto (
        clientes_id_cli
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_cons_mecid_fk_mec_cons ON
    prj_concessionaria.conserto (
        mecanicos_colaboradores_id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.pk_cons ON
    prj_concessionaria.conserto (
        id_cons
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

GRANT SELECT ON prj_concessionaria.conserto TO ro_clientes;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.conserto TO ro_conserto;

ALTER TABLE prj_concessionaria.conserto
    ADD CONSTRAINT pk_cons PRIMARY KEY ( id_cons )
        USING INDEX prj_concessionaria.pk_cons;

CREATE TABLE prj_concessionaria.fornecedores (
    id_forn        NUMBER(3)
        CONSTRAINT nn_forn_id NOT NULL,
    num_cnpj_forn  CHAR(19 BYTE)
        CONSTRAINT nn_forn_cnpj NOT NULL,
    nom_forn       VARCHAR2(100 BYTE)
        CONSTRAINT nn_forn_nome NOT NULL,
    num_tel_forn   CHAR(11 BYTE),
    nom_email_forn VARCHAR2(50 BYTE),
    nom_ender_forn VARCHAR2(50 BYTE)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE UNIQUE INDEX prj_concessionaria.pk_forn ON
    prj_concessionaria.fornecedores (
        id_forn
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.un_forn_cnpj ON
    prj_concessionaria.fornecedores (
        num_cnpj_forn
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, UPDATE ON prj_concessionaria.fornecedores TO ro_fornecedores;

ALTER TABLE prj_concessionaria.fornecedores
    ADD CONSTRAINT pk_forn PRIMARY KEY ( id_forn )
        USING INDEX prj_concessionaria.pk_forn;

ALTER TABLE prj_concessionaria.fornecedores
    ADD CONSTRAINT un_forn_cnpj UNIQUE ( num_cnpj_forn )
        USING INDEX prj_concessionaria.un_forn_cnpj;

CREATE TABLE prj_concessionaria.gerentes (
    colaboradores_id_colab NUMBER(5)
        CONSTRAINT nn_ger_colid NOT NULL,
    num_dep_ger            NUMBER(2) NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE UNIQUE INDEX prj_concessionaria.pk_ger ON
    prj_concessionaria.gerentes (
        colaboradores_id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE prj_concessionaria.gerentes
    ADD CONSTRAINT pk_ger PRIMARY KEY ( colaboradores_id_colab )
        USING INDEX prj_concessionaria.pk_ger;

CREATE TABLE prj_concessionaria.mecanicos (
    colaboradores_id_colab NUMBER(5)
        CONSTRAINT nn_mec_colid NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE UNIQUE INDEX prj_concessionaria.pk_mec ON
    prj_concessionaria.mecanicos (
        colaboradores_id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE prj_concessionaria.mecanicos
    ADD CONSTRAINT pk_mec PRIMARY KEY ( colaboradores_id_colab )
        USING INDEX prj_concessionaria.pk_mec;

CREATE TABLE prj_concessionaria.pecas (
    id_pec        NUMBER(7)
        CONSTRAINT nn_pec_id NOT NULL,
    carros_id_car NUMBER(5)
        CONSTRAINT nn_pec_carid NOT NULL,
    nom_pec       VARCHAR2(30 BYTE)
        CONSTRAINT nn_pec_nome NOT NULL,
    num_prc_pec   FLOAT(6),
    desc_pec      CLOB
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
        LOB ( desc_pec ) STORE AS SECUREFILE (
            TABLESPACE data_tablespace
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS UNLIMITED FREELISTS 1 BUFFER_POOL DEFAULT )
            CHUNK 8192
            RETENTION
            ENABLE STORAGE IN ROW
            NOCACHE LOGGING
        )
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_pec_carid_fk_car_pec ON
    prj_concessionaria.pecas (
        carros_id_car
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.pk_pec ON
    prj_concessionaria.pecas (
        id_pec
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.pecas TO ro_pecas;

ALTER TABLE prj_concessionaria.pecas
    ADD CONSTRAINT pk_pec PRIMARY KEY ( id_pec )
        USING INDEX prj_concessionaria.pk_pec;

CREATE TABLE prj_concessionaria.pecas_conserto (
    pecas_id_pec     NUMBER(7)
        CONSTRAINT nn_pc_pecid NOT NULL,
    conserto_id_cons NUMBER(5)
        CONSTRAINT nn_pc_consid NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_pc_consid_fk_cons_pc ON
    prj_concessionaria.pecas_conserto (
        conserto_id_cons
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_pc_pecid_fk_pec_pc ON
    prj_concessionaria.pecas_conserto (
        pecas_id_pec
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.pecas_conserto TO ro_pecas;

CREATE TABLE prj_concessionaria.pecas_fornecidas (
    pecas_id_pec         NUMBER(7)
        CONSTRAINT nn_pf_pecid NOT NULL,
    fornecedores_id_forn NUMBER(3)
        CONSTRAINT nn_pf_forid NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_pf_forid_fk_forn_pf ON
    prj_concessionaria.pecas_fornecidas (
        fornecedores_id_forn
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_pf_pecid_fk_pec_pf ON
    prj_concessionaria.pecas_fornecidas (
        pecas_id_pec
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.pk_pf ON
    prj_concessionaria.pecas_fornecidas (
        pecas_id_pec
    ASC,
        fornecedores_id_forn
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.pecas_fornecidas TO ro_fornecedores;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.pecas_fornecidas TO ro_pecas;

ALTER TABLE prj_concessionaria.pecas_fornecidas
    ADD CONSTRAINT pk_pf PRIMARY KEY ( pecas_id_pec,
                                       fornecedores_id_forn )
        USING INDEX prj_concessionaria.pk_pf;

CREATE TABLE prj_concessionaria.pecas_fornecidas_por_concessionarias (
    pecas_fornecidas_pecas_id_pec         NUMBER(7)
        CONSTRAINT nn_pfc_pfid NOT NULL,
    pecas_fornecidas_fornecedores_id_forn NUMBER(3)
        CONSTRAINT nn_pfc_pffid NOT NULL,
    concessionarias_cod_concessionarias   NUMBER(3)
        CONSTRAINT nn_pfc_codcn NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_pfc_codcn_fk_conc_pfc ON
    prj_concessionaria.pecas_fornecidas_por_concessionarias (
        concessionarias_cod_concessionarias
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_pfc_pfid_pffid_fk_pf_pfc ON
    prj_concessionaria.pecas_fornecidas_por_concessionarias (
        pecas_fornecidas_pecas_id_pec
    ASC,
        pecas_fornecidas_fornecedores_id_forn
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.pecas_fornecidas_por_concessionarias TO ro_concessionarias;

CREATE TABLE prj_concessionaria.vendas (
    vendedores_colaboradores_id_colab NUMBER(5)
        CONSTRAINT nn_cvc_vendedores_colaboradores_id_colab NOT NULL,
    clientes_id_cli                   NUMBER(5)
        CONSTRAINT nn_cvc_clientes_id_cli NOT NULL,
    carros_id_car                     NUMBER(5)
        CONSTRAINT nn_cvc_carros_id_car NOT NULL,
    num_prc_venda                     FLOAT(9),
    dta_venda                         DATE,
    id_venda                          NUMBER(5) NOT NULL,
    num_vendas                        NUMBER(5)
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE INDEX prj_concessionaria.idx_cvc_carros_id_car_fk_car_cvc ON
    prj_concessionaria.vendas (
        carros_id_car
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_cvc_clientes_id_cli_fk_cli_cvc ON
    prj_concessionaria.vendas (
        clientes_id_cli
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE INDEX prj_concessionaria.idx_cvc_vendedores_colaboradores_id_colab_fk_ven_cvc ON
    prj_concessionaria.vendas (
        vendedores_colaboradores_id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX prj_concessionaria.pk_vendas ON
    prj_concessionaria.vendas (
        id_venda
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

GRANT SELECT ON prj_concessionaria.vendas TO ro_clientes;

GRANT DELETE, INSERT, SELECT, UPDATE ON prj_concessionaria.vendas TO ro_vendas;

ALTER TABLE prj_concessionaria.vendas
    ADD CONSTRAINT vendas_pk PRIMARY KEY ( id_venda )
        USING INDEX prj_concessionaria.pk_vendas;

CREATE TABLE prj_concessionaria.vendedores (
    colaboradores_id_colab NUMBER(10)
        CONSTRAINT nn_ven_colid NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE data_tablespace LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT
    )
NO INMEMORY
    ENABLE ROW MOVEMENT;

CREATE UNIQUE INDEX prj_concessionaria.pk_ven ON
    prj_concessionaria.vendedores (
        colaboradores_id_colab
    ASC )
        TABLESPACE index_tablespace PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE prj_concessionaria.vendedores
    ADD CONSTRAINT pk_ven PRIMARY KEY ( colaboradores_id_colab )
        USING INDEX prj_concessionaria.pk_ven;

ALTER TABLE prj_concessionaria.conserto
    ADD CONSTRAINT fk_car_cons FOREIGN KEY ( carros_id_car )
        REFERENCES prj_concessionaria.carros ( id_car )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.vendas
    ADD CONSTRAINT fk_car_cvc FOREIGN KEY ( carros_id_car )
        REFERENCES prj_concessionaria.carros ( id_car )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas
    ADD CONSTRAINT fk_car_pec FOREIGN KEY ( carros_id_car )
        REFERENCES prj_concessionaria.carros ( id_car )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.conserto
    ADD CONSTRAINT fk_cli_cons FOREIGN KEY ( clientes_id_cli )
        REFERENCES prj_concessionaria.clientes ( id_cli )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.vendas
    ADD CONSTRAINT fk_cli_cvc FOREIGN KEY ( clientes_id_cli )
        REFERENCES prj_concessionaria.clientes ( id_cli )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.gerentes
    ADD CONSTRAINT fk_colab_ger FOREIGN KEY ( colaboradores_id_colab )
        REFERENCES prj_concessionaria.colaboradores ( id_colab )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.mecanicos
    ADD CONSTRAINT fk_colab_mec FOREIGN KEY ( colaboradores_id_colab )
        REFERENCES prj_concessionaria.colaboradores ( id_colab )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.vendedores
    ADD CONSTRAINT fk_colab_ven FOREIGN KEY ( colaboradores_id_colab )
        REFERENCES prj_concessionaria.colaboradores ( id_colab )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.colaboradores
    ADD CONSTRAINT fk_conc_colab FOREIGN KEY ( concessionarias_cod_concessionarias )
        REFERENCES prj_concessionaria.concessionarias ( cod_concessionarias )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas_fornecidas_por_concessionarias
    ADD CONSTRAINT fk_conc_pfc FOREIGN KEY ( concessionarias_cod_concessionarias )
        REFERENCES prj_concessionaria.concessionarias ( cod_concessionarias )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas_conserto
    ADD CONSTRAINT fk_cons_pc FOREIGN KEY ( conserto_id_cons )
        REFERENCES prj_concessionaria.conserto ( id_cons )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas_fornecidas
    ADD CONSTRAINT fk_forn_pf FOREIGN KEY ( fornecedores_id_forn )
        REFERENCES prj_concessionaria.fornecedores ( id_forn )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.concessionarias
    ADD CONSTRAINT fk_ger_conc FOREIGN KEY ( gerentes_colaboradores_id_colab )
        REFERENCES prj_concessionaria.gerentes ( colaboradores_id_colab )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.conserto
    ADD CONSTRAINT fk_mec_cons FOREIGN KEY ( mecanicos_colaboradores_id_colab )
        REFERENCES prj_concessionaria.mecanicos ( colaboradores_id_colab )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas_conserto
    ADD CONSTRAINT fk_pec_pc FOREIGN KEY ( pecas_id_pec )
        REFERENCES prj_concessionaria.pecas ( id_pec )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas_fornecidas
    ADD CONSTRAINT fk_pec_pf FOREIGN KEY ( pecas_id_pec )
        REFERENCES prj_concessionaria.pecas ( id_pec )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.pecas_fornecidas_por_concessionarias
    ADD CONSTRAINT fk_pf_pfc FOREIGN KEY ( pecas_fornecidas_pecas_id_pec,
                                           pecas_fornecidas_fornecedores_id_forn )
        REFERENCES prj_concessionaria.pecas_fornecidas ( pecas_id_pec,
                                                         fornecedores_id_forn )
    NOT DEFERRABLE;

ALTER TABLE prj_concessionaria.vendas
    ADD CONSTRAINT fk_ven_cvc FOREIGN KEY ( vendedores_colaboradores_id_colab )
        REFERENCES prj_concessionaria.vendedores ( colaboradores_id_colab )
    NOT DEFERRABLE;

CREATE OR REPLACE VIEW PRJ_CONCESSIONARIA.CAR_INFO ( ID_CAR, NUM_PLACA_CAR, NOM_MODELO_CAR, NOM_COR_CAR, NUM_ANO_CAR ) AS
SELECT car.id_car,car.num_placa_car, car.nom_modelo_car, car.nom_cor_car, car.num_ano_car
    
FROM carros car 
;



GRANT SELECT 
ON PRJ_CONCESSIONARIA.CAR_INFO TO RO_CARROS 
;


GRANT SELECT 
ON PRJ_CONCESSIONARIA.CAR_INFO TO RO_VENDAS 
;

CREATE OR REPLACE VIEW PRJ_CONCESSIONARIA.ESTOQUE_CARROS ( ID_CAR, NOM_MODELO_CAR, NUM_ANO_CAR, NOM_COR_CAR, QTD_DISPONIVEL ) AS
SELECT car.id_car, car.nom_modelo_car, car.num_ano_car, car.nom_cor_car, count(*) AS qtd_disponivel
    
FROM carros car
GROUP BY car.id_car, car.nom_modelo_car, car.num_ano_car, car.nom_cor_car 
;



GRANT SELECT 
ON PRJ_CONCESSIONARIA.ESTOQUE_CARROS TO RO_CARROS 
;


GRANT SELECT 
ON PRJ_CONCESSIONARIA.ESTOQUE_CARROS TO RO_CONCESSIONARIAS 
;

CREATE OR REPLACE VIEW PRJ_CONCESSIONARIA.ESTOQUE_PECAS ( ID_PEC, NOM_PEC, QTD_DISPONIVEL ) AS
SELECT id_pec, nom_pec, COUNT(*) AS qtd_disponivel

FROM pecas

GROUP BY  id_pec, nom_pec 
;



GRANT SELECT 
ON PRJ_CONCESSIONARIA.ESTOQUE_PECAS TO RO_PECAS 
;

CREATE OR REPLACE VIEW PRJ_CONCESSIONARIA.SERVICO_CONSERTOS ( ID_CONS, CARROS_ID_CAR, NUM_PLACA_CAR, ID_CLI, COLABORADORES_ID_COLAB, NOM_TIPO_CONS, NUM_CUST_CONS, PECAS_ID_PEC, NOM_PEC, NUM_PRC_PEC ) AS
SELECT c.id_cons, c.carros_id_car,ca.num_placa_car, cl.id_cli, m.colaboradores_id_colab, c.nom_tipo_cons, c.num_cust_cons, pc.pecas_id_pec, p.nom_pec, p.num_prc_pec
FROM prj_concessionaria.conserto c
INNER JOIN prj_concessionaria.carros ca ON c.carros_id_car = ca.id_car
INNER JOIN prj_concessionaria.clientes cl ON c.clientes_id_cli = cl.id_cli
INNER JOIN prj_concessionaria.mecanicos m ON c.mecanicos_colaboradores_id_colab = m.colaboradores_id_colab
INNER JOIN prj_concessionaria.pecas_conserto pc ON c.id_cons = pc.conserto_id_cons
INNER JOIN prj_concessionaria.pecas p ON pc.pecas_id_pec = p.id_pec 
;



GRANT SELECT 
ON PRJ_CONCESSIONARIA.SERVICO_CONSERTOS TO RO_CLIENTES 
;


GRANT SELECT 
ON PRJ_CONCESSIONARIA.SERVICO_CONSERTOS TO RO_CONSERTO 
;

CREATE OR REPLACE VIEW PRJ_CONCESSIONARIA.VENDAS_DETALHADAS ( ID_VENDA, NUM_VENDAS, NUM_PRC_VENDA, DTA_VENDA, NUM_PLACA_CAR, NOM_MODELO_CAR, NUM_ANO_CAR, NOM_COR_CAR, NUM_CPF_CLI, NOM_CLI, COLABORADORES_ID_COLAB ) AS
SELECT V.ID_VENDA, V.NUM_VENDAS, V.NUM_PRC_VENDA,  V.DTA_VENDA , C.NUM_PLACA_CAR, C.NOM_MODELO_CAR, C.NUM_ANO_CAR, C.NOM_COR_CAR, CL.NUM_CPF_CLI, CL.NOM_CLI, VD.COLABORADORES_ID_COLAB  
    
FROM VENDAS V

INNER JOIN CARROS C ON V.CARROS_ID_CAR = C.ID_CAR
INNER JOIN CLIENTES CL ON V.CLIENTES_ID_CLI = CL.ID_CLI
INNER JOIN VENDEDORES VD ON V.VENDEDORES_COLABORADORES_ID_COLAB = VD.COLABORADORES_ID_COLAB 
;



GRANT SELECT 
ON PRJ_CONCESSIONARIA.VENDAS_DETALHADAS TO RO_VENDAS 
;

CREATE OR REPLACE TRIGGER prj_concessionaria.cli_id_cli_trg BEFORE
    INSERT ON prj_concessionaria.clientes
    FOR EACH ROW
    WHEN ( new.id_cli IS NULL )
BEGIN
    :new.id_cli := prj_concessionaria.cli_id_cli_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER prj_concessionaria.cons_id_trg BEFORE
    INSERT ON prj_concessionaria.conserto
    FOR EACH ROW
    WHEN ( new.id_cons IS NULL )
BEGIN
    :new.id_cons := prj_concessionaria.cons_id_cons_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER prj_concessionaria.vendas_id_vendas_trg BEFORE
    INSERT ON prj_concessionaria.vendas
    FOR EACH ROW
    WHEN ( new.id_venda IS NULL )
BEGIN
    :new.id_venda := prj_concessionaria.vendas_id_vendas_seq.nextval;
END;
/

ALTER SYSTEM SET UNDO_MANAGEMENT=AUTO SCOPE=SPFILE;

ALTER SYSTEM SET UNDO_RETENTION = 604800

GRANT FLASHBACK ON CARROS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON CLIENTES TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON COLABORADORES TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON CONCESSIONARIAS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON CONSERTO TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON FORNECEDORES TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON GERENTES TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON MECANICOS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON PECAS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON PECAS_CONSERTO TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON PECAS_FORNECIDAS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON PECAS_FORNECIDAS_POR_CONCESSIONARIAS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON VENDAS TO PRJ_CONCESSIONARIA;

GRANT FLASHBACK ON VENDEDORES TO PRJ_CONCESSIONARIA;

GRANT EXECUTE ON DBMS_FLASHBACK TO PRJ_CONCESSIONARIA;

SELECT CURRENT_SCN FROM V$DATABASE;

-- CURRENT_SCN
-- 2826307

EXECUTE DBMS_FLASHBACK.ENABLE_AT_SYSTEM_CHANGE_NUMBER(2826307);

GRANT SELECT ANY TRANSACTION TO PRJ_CONCESSIONARIA;

EXECUTE DBMS_FLASHBACK.DISABLE;

ALTER TABLE CARROS ENABLE ROW MOVEMENT;

ALTER TABLE CLIENTES ENABLE ROW MOVEMENT;

ALTER TABLE COLABORADORES ENABLE ROW MOVEMENT;

ALTER TABLE CONCESSIONARIAS ENABLE ROW MOVEMENT;

ALTER TABLE CONSERTO ENABLE ROW MOVEMENT;

ALTER TABLE FORNECEDORES ENABLE ROW MOVEMENT;

ALTER TABLE GERENTES ENABLE ROW MOVEMENT;

ALTER TABLE MECANICOS ENABLE ROW MOVEMENT;

ALTER TABLE PECAS ENABLE ROW MOVEMENT;

ALTER TABLE PECAS_CONSERTO ENABLE ROW MOVEMENT;

ALTER TABLE PECAS_FORNECIDAS ENABLE ROW MOVEMENT;

ALTER TABLE PECAS_FORNECIDAS_POR_CONCESSIONARIAS ENABLE ROW MOVEMENT;

ALTER TABLE VENDAS ENABLE ROW MOVEMENT;

ALTER TABLE VENDEDORES ENABLE ROW MOVEMENT;

ALTER SYSTEM SET recyclebin = ON SCOPE=SPFILE; 

CREATE FLASHBACK ARCHIVE DATA_ARCHIVE
TABLESPACE DATA_TABLESPACE
RETENTION 30 DAY;

CREATE FLASHBACK ARCHIVE INDEX_ARCHIVE
TABLESPACE INDEX_TABLESPACE
RETENTION 30 DAY;

ALTER TABLE CARROS FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE CLIENTES FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE COLABORADORES FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE CONCESSIONARIAS FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE CONSERTO FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE FORNECEDORES FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE GERENTES FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE MECANICOS FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE PECAS FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE PECAS_CONSERTO FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE PECAS_FORNECIDAS FLASHBACK ARCHIVE DATA_ARCHIVE; 

ALTER TABLE PECAS_FORNECIDAS_POR_CONCESSIONARIAS FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE VENDAS FLASHBACK ARCHIVE DATA_ARCHIVE;

ALTER TABLE VENDEDORES FLASHBACK ARCHIVE DATA_ARCHIVE; 



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            14
-- CREATE INDEX                            32
-- ALTER TABLE                             38
-- CREATE VIEW                              5
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           3
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         1
-- CREATE DISK GROUP                        0
-- CREATE ROLE                             14
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          3
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        3
-- CREATE USER                              7
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
