package com.github.coco.service.impl;

import com.github.coco.dao.StackDAO;
import com.github.coco.entity.Stack;
import com.github.coco.service.StackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yan
 */
@Service
public class StackServiceImpl implements StackService {
    @Resource
    private StackDAO stackDAO;

    @Override
    public int createStack(Stack stack) {
        return stackDAO.insertStack(stack);
    }

    @Override
    public int removeStack(Stack stack) {
        return stackDAO.deleteStack(stack);
    }

    @Override
    public int modifyStack(Stack stack) {
        return 0;
    }

    @Override
    public Stack getStack(Stack stack) {
        return stackDAO.selectStack(stack);
    }

    @Override
    public List<Stack> getStacks(Stack stack, int pageNo, int pageSize) {
        return stackDAO.selectStacks(stack, (pageNo - 1) * pageSize, pageSize);
    }

    @Override
    public int getStackTotal(Stack stack) {
        return stackDAO.selectStackTotal(stack);
    }
}
