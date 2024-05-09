package es.alten.cuentame.bo.impl;

import es.alten.cuentame.bo.TemporadaBO;
import es.alten.cuentame.dao.TemporadaRepository;
import es.alten.cuentame.domain.ElvisEntity;
import es.alten.cuentame.domain.entity.QTemporada;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.BaseFilterDTO;
import es.alten.cuentame.dto.TemporadaFilterDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class TemporadaBOImpl extends ElvisGenericCRUDServiceImpl<Temporada, Integer, QTemporada, TemporadaFilterDTO, TemporadaRepository>
    implements TemporadaBO {




}
