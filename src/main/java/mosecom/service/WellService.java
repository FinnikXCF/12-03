package mosecom.service;

import java.io.IOException;
import java.util.List;

import mosecom.model.*;
import org.springframework.web.multipart.MultipartFile;

import mosecom.dto.WellFullProjection;
import mosecom.dto.WellProjection;

public interface WellService {

	List<WellProjection> getWellsList();

	Well getWell(int id);

	Well save(WellFullProjection well, MultipartFile[] file) throws IllegalStateException, IOException;

	List<ConstructionType> getAllConstructionTypes();

	List<Diametr> getAllDiametrs();

	List<Horisont> getAllHorisonts();

	WellsDocument getWellDocument(int id);
}