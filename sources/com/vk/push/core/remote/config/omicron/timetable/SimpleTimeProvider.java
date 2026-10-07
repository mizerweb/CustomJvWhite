package com.vk.push.core.remote.config.omicron.timetable;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleTimeProvider implements TimeProvider {
    @Override // com.vk.push.core.remote.config.omicron.timetable.TimeProvider
    public Date getCurrentDate() {
        return new Date();
    }
}
