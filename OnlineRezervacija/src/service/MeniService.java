package service;

import java.util.List;

import dao.MeniDao;
import model.TopliNapitoci;


public class MeniService {
	private MeniDao napitoci;

	public List<TopliNapitoci> listajNapitoci() {
		return napitoci.listajNapitoci();
	}
}
