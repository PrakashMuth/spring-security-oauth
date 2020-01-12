--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5
-- Dumped by pg_dump version 11.5

-- Started on 2019-12-14 14:28:25

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 48847)
-- Name: permission; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.permission
(
    id   integer                NOT NULL,
    name character varying(512) NOT NULL
);


ALTER TABLE public.permission
    OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 48853)
-- Name: permission_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.permission_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.permission_id_seq
    OWNER TO postgres;

--
-- TOC entry 2865 (class 0 OID 0)
-- Dependencies: 197
-- Name: permission_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.permission_id_seq OWNED BY public.permission.id;


--
-- TOC entry 198 (class 1259 OID 48855)
-- Name: role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.role
(
    id   integer                NOT NULL,
    name character varying(512) NOT NULL
);


ALTER TABLE public.role
    OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 48861)
-- Name: role_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.role_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.role_id_seq
    OWNER TO postgres;

--
-- TOC entry 2866 (class 0 OID 0)
-- Dependencies: 199
-- Name: role_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.role_id_seq OWNED BY public.role.id;


--
-- TOC entry 200 (class 1259 OID 48863)
-- Name: role_permission; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.role_permission
(
    role_id       integer NOT NULL,
    permission_id integer NOT NULL
);


ALTER TABLE public.role_permission
    OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 48866)
-- Name: user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."user"
(
    id         integer                NOT NULL,
    first_name character varying(256) NOT NULL,
    last_name  character varying(256) NOT NULL,
    user_name  character varying(256) NOT NULL,
    email      character varying(50)  NOT NULL,
    password   character varying(256) NOT NULL,
    created_at time without time zone NOT NULL
);


ALTER TABLE public."user"
    OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 48872)
-- Name: user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user_id_seq
    OWNER TO postgres;

--
-- TOC entry 2867 (class 0 OID 0)
-- Dependencies: 202
-- Name: user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.user_id_seq OWNED BY public."user".id;


--
-- TOC entry 203 (class 1259 OID 48874)
-- Name: user_role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.user_role
(
    user_id integer NOT NULL,
    role_id integer NOT NULL
);


ALTER TABLE public.user_role
    OWNER TO postgres;

--
-- TOC entry 2708 (class 2604 OID 48877)
-- Name: permission id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permission
    ALTER COLUMN id SET DEFAULT nextval('public.permission_id_seq'::regclass);


--
-- TOC entry 2709 (class 2604 OID 48878)
-- Name: role id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role
    ALTER COLUMN id SET DEFAULT nextval('public.role_id_seq'::regclass);


--
-- TOC entry 2710 (class 2604 OID 48879)
-- Name: user id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ALTER COLUMN id SET DEFAULT nextval('public.user_id_seq'::regclass);


--
-- TOC entry 2852 (class 0 OID 48847)
-- Dependencies: 196
-- Data for Name: permission; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.permission (id, name) FROM stdin;
\.


--
-- TOC entry 2854 (class 0 OID 48855)
-- Dependencies: 198
-- Data for Name: role; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.role (id, name) FROM stdin;
\.


--
-- TOC entry 2856 (class 0 OID 48863)
-- Dependencies: 200
-- Data for Name: role_permission; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.role_permission (role_id, permission_id) FROM stdin;
\.


--
-- TOC entry 2857 (class 0 OID 48866)
-- Dependencies: 201
-- Data for Name: user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."user" (id, first_name, last_name, user_name, email, password, created_at) FROM stdin;
\.


--
-- TOC entry 2859 (class 0 OID 48874)
-- Dependencies: 203
-- Data for Name: user_role; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.user_role (user_id, role_id) FROM stdin;
\.


--
-- TOC entry 2868 (class 0 OID 0)
-- Dependencies: 197
-- Name: permission_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.permission_id_seq', 1, false);


--
-- TOC entry 2869 (class 0 OID 0)
-- Dependencies: 199
-- Name: role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.role_id_seq', 1, false);


--
-- TOC entry 2870 (class 0 OID 0)
-- Dependencies: 202
-- Name: user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_id_seq', 1, false);


--
-- TOC entry 2716 (class 2606 OID 48881)
-- Name: role name_un; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role
    ADD CONSTRAINT name_un UNIQUE (name);


--
-- TOC entry 2712 (class 2606 OID 48883)
-- Name: permission permission_name_un; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permission
    ADD CONSTRAINT permission_name_un UNIQUE (name);


--
-- TOC entry 2714 (class 2606 OID 48885)
-- Name: permission permission_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permission
    ADD CONSTRAINT permission_pkey PRIMARY KEY (id);


--
-- TOC entry 2720 (class 2606 OID 48887)
-- Name: role_permission role_permission_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role_permission
    ADD CONSTRAINT role_permission_pkey PRIMARY KEY (role_id, permission_id);


--
-- TOC entry 2718 (class 2606 OID 48889)
-- Name: role role_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (id);


--
-- TOC entry 2722 (class 2606 OID 48891)
-- Name: user user_email_name_un; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_email_name_un UNIQUE (user_name, email);


--
-- TOC entry 2724 (class 2606 OID 48893)
-- Name: user user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);


--
-- TOC entry 2726 (class 2606 OID 48895)
-- Name: user_role user_role_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT user_role_pkey PRIMARY KEY (user_id, role_id);


--
-- TOC entry 2727 (class 2606 OID 48896)
-- Name: role_permission permission_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role_permission
    ADD CONSTRAINT permission_id_fk FOREIGN KEY (permission_id) REFERENCES public.permission (id);


--
-- TOC entry 2728 (class 2606 OID 48901)
-- Name: role_permission role_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role_permission
    ADD CONSTRAINT role_id_fk FOREIGN KEY (role_id) REFERENCES public.role (id);


--
-- TOC entry 2729 (class 2606 OID 48906)
-- Name: user_role role_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT role_id_fk FOREIGN KEY (user_id) REFERENCES public.role (id);


--
-- TOC entry 2730 (class 2606 OID 48911)
-- Name: user_role user_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES public."user" (id);


-- Completed on 2019-12-14 14:28:25

--
-- PostgreSQL database dump complete
--

