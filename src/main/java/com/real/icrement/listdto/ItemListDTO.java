package com.real.icrement.listdto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.real.icrement.dto.ItemDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemListDTO {

	private List<ItemDTO> items = new ArrayList<>();

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}

}
