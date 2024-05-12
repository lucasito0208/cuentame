package es.alten.cuentame.bo.impl;

import javax.transaction.Transactional;

import es.alten.cuentame.dto.TemporadaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import es.alten.cuentame.bo.TemporadaBO;
import es.alten.cuentame.dao.TemporadaRepository;
import es.alten.cuentame.domain.entity.QTemporada;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.filters.TemporadaFilterDTO;

import static es.alten.cuentame.utils.ObjectMapper.mapper;


@Service
@Transactional
public class TemporadaBOImpl extends ElvisGenericCRUDServiceImpl<Temporada, Integer, QTemporada, TemporadaFilterDTO, TemporadaRepository>
    implements TemporadaBO {

        //private static final ObjectMapper mapper = new ObjectMapper();
        private static final Logger LOG = LoggerFactory.getLogger(TemporadaBOImpl.class);

        @Override
        public Temporada findById(int n_temp) {
            LOG.info("prueba de temporada");
            return this.repository.findById(n_temp);
        }

        @Override
        public Temporada crearTemporada(Temporada temporada) {
            LOG.info("Creación de temporada");
            return this.repository.save(temporada);
        
        }

    @Override
    public TemporadaDTO toDTO(Temporada temp) {

        return mapper.map(temp, TemporadaDTO.class);
    }


}
