package com.taotao.service;

import com.taotao.common.EUDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.result.TaotaoResult;

public interface ItemService {

	TbItem getItemById(long itemId);
	
	public EUDataGridResult getItemList(int page, int rows);

	public TaotaoResult saveItem(TbItem item);

	
	
}
