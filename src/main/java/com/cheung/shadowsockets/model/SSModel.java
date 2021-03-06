package com.cheung.shadowsockets.model;

import com.cheung.shadowsockets.encryption.ICrypt;
import io.netty.channel.ChannelHandlerContext;
import lombok.Data;

import java.util.List;

/**
 * Created by cheungrp on 18/7/3.
 */
@Data
public class SSModel {

    private ChannelHandlerContext channelHandlerContext;
    private ICrypt crypt;
    private List<byte[]> data;
}
