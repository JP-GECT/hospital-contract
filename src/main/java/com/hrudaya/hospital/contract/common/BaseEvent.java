package com.hrudaya.hospital.contract.common;


import com.hrudaya.hospital.contract.enums.ModuleType;

import java.time.Instant;
import java.util.UUID;

public abstract class BaseEvent {

    private final String eventId;
    private final Instant timestamp;
    private final ModuleType sourceModule;
    private final String version;

    protected BaseEvent(ModuleType sourceModule, String version) {
        this.eventId = UUID.randomUUID().toString();
        this.timestamp = Instant.now();
        this.sourceModule = sourceModule;
        this.version = version;
    }

    public String getEventId() {
        return eventId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public ModuleType getSourceModule() {
        return sourceModule;
    }

    public String getVersion() {
        return version;
    }
}