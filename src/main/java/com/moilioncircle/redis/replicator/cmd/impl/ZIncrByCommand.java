/*
 * Copyright 2016 leon chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class ZIncrByCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String key;
    private double increment;
    private String member;
    private byte[] rawKey;
    private byte[] rawMember;

    public ZIncrByCommand() {
    }

    public ZIncrByCommand(String key, double increment, String member) {
        this(key, increment, member, null, null);
    }

    public ZIncrByCommand(String key, double increment, String member, byte[] rawKey, byte[] rawMember) {
        this.key = key;
        this.increment = increment;
        this.member = member;
        this.rawKey = rawKey;
        this.rawMember = rawMember;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public byte[] getRawKey() {
        return rawKey;
    }

    public void setRawKey(byte[] rawKey) {
        this.rawKey = rawKey;
    }

    public byte[] getRawMember() {
        return rawMember;
    }

    public void setRawMember(byte[] rawMember) {
        this.rawMember = rawMember;
    }

    @Override
    public String toString() {
        return "ZIncrByCommand{" +
                "key='" + key + '\'' +
                ", increment='" + increment + '\'' +
                ", member='" + member + '\'' +
                '}';
    }

}
