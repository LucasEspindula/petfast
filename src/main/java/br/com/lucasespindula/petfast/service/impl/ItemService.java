package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.ItemRepository;
import br.com.lucasespindula.petfast.service.dto.ItemDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.ItemConverter.itemDtoToEntity;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void registerItem(ItemDTO itemDTO) {
        itemRepository.save(itemDtoToEntity(itemDTO));
    }
}
