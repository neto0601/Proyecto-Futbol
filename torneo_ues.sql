-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-07-2018 a las 05:27:50
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneo_ues`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arbitros`
--

CREATE TABLE `arbitros` (
  `IdArbitro` int(1) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arbitros_partidos`
--

CREATE TABLE `arbitros_partidos` (
  `IdRegistro` int(5) NOT NULL,
  `IdArbitro` int(1) NOT NULL,
  `IdPartido` int(5) NOT NULL,
  `Puesto` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `canchas`
--

CREATE TABLE `canchas` (
  `IdCancha` int(1) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Ubicacion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `IdEquipo` int(5) NOT NULL,
  `Nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hechos`
--

CREATE TABLE `hechos` (
  `IdHecho` int(5) NOT NULL,
  `IdTipo` int(5) NOT NULL,
  `IdPartido` int(5) NOT NULL,
  `carnet` varchar(7) NOT NULL,
  `minuto` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugadores`
--

CREATE TABLE `jugadores` (
  `carnet` varchar(7) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `IdEquipo` int(5) NOT NULL,
  `carrera` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos`
--

CREATE TABLE `partidos` (
  `IdPartido` int(5) NOT NULL,
  `EquipoL` int(5) NOT NULL,
  `Equipov` int(5) NOT NULL,
  `IdCancha` int(1) NOT NULL,
  `Fecha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_hechos`
--

CREATE TABLE `tipos_hechos` (
  `IdTipo` int(5) NOT NULL,
  `Descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(1) NOT NULL,
  `user` varchar(30) NOT NULL,
  `contraseña` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `user`, `contraseña`) VALUES
(1, 'admin', 'admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arbitros`
--
ALTER TABLE `arbitros`
  ADD PRIMARY KEY (`IdArbitro`);

--
-- Indices de la tabla `arbitros_partidos`
--
ALTER TABLE `arbitros_partidos`
  ADD PRIMARY KEY (`IdRegistro`),
  ADD KEY `IdArbitro` (`IdArbitro`),
  ADD KEY `IdPartido` (`IdPartido`);

--
-- Indices de la tabla `canchas`
--
ALTER TABLE `canchas`
  ADD PRIMARY KEY (`IdCancha`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`IdEquipo`);

--
-- Indices de la tabla `hechos`
--
ALTER TABLE `hechos`
  ADD PRIMARY KEY (`IdHecho`),
  ADD KEY `IdTipo` (`IdTipo`),
  ADD KEY `IdPartido` (`IdPartido`),
  ADD KEY `carnet` (`carnet`);

--
-- Indices de la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD PRIMARY KEY (`carnet`),
  ADD KEY `IdEquipo` (`IdEquipo`);

--
-- Indices de la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD PRIMARY KEY (`IdPartido`),
  ADD KEY `EquipoL` (`EquipoL`),
  ADD KEY `Equipov` (`Equipov`),
  ADD KEY `IdCancha` (`IdCancha`);

--
-- Indices de la tabla `tipos_hechos`
--
ALTER TABLE `tipos_hechos`
  ADD PRIMARY KEY (`IdTipo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arbitros`
--
ALTER TABLE `arbitros`
  MODIFY `IdArbitro` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `arbitros_partidos`
--
ALTER TABLE `arbitros_partidos`
  MODIFY `IdRegistro` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `canchas`
--
ALTER TABLE `canchas`
  MODIFY `IdCancha` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `equipos`
--
ALTER TABLE `equipos`
  MODIFY `IdEquipo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `hechos`
--
ALTER TABLE `hechos`
  MODIFY `IdHecho` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `partidos`
--
ALTER TABLE `partidos`
  MODIFY `IdPartido` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipos_hechos`
--
ALTER TABLE `tipos_hechos`
  MODIFY `IdTipo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arbitros_partidos`
--
ALTER TABLE `arbitros_partidos`
  ADD CONSTRAINT `arbitros_partidos_ibfk_1` FOREIGN KEY (`IdArbitro`) REFERENCES `arbitros` (`IdArbitro`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `arbitros_partidos_ibfk_2` FOREIGN KEY (`IdPartido`) REFERENCES `partidos` (`IdPartido`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `hechos`
--
ALTER TABLE `hechos`
  ADD CONSTRAINT `hechos_ibfk_1` FOREIGN KEY (`IdTipo`) REFERENCES `tipos_hechos` (`IdTipo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hechos_ibfk_2` FOREIGN KEY (`IdPartido`) REFERENCES `partidos` (`IdPartido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hechos_ibfk_3` FOREIGN KEY (`carnet`) REFERENCES `jugadores` (`carnet`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD CONSTRAINT `jugadores_ibfk_1` FOREIGN KEY (`IdEquipo`) REFERENCES `equipos` (`IdEquipo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD CONSTRAINT `partidos_ibfk_1` FOREIGN KEY (`EquipoL`) REFERENCES `equipos` (`IdEquipo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `partidos_ibfk_2` FOREIGN KEY (`Equipov`) REFERENCES `equipos` (`IdEquipo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `partidos_ibfk_3` FOREIGN KEY (`IdCancha`) REFERENCES `canchas` (`IdCancha`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
