package com.vk.push.core.remote.config.omicron;

import defpackage.iw8;
import defpackage.px8;
import defpackage.xr8;
import defpackage.yr8;

/* JADX INFO: loaded from: classes2.dex */
public interface OmicronEnvironment {
    public static final OmicronEnvironment DEV = new iw8(3);
    public static final OmicronEnvironment ALPHA = new px8();
    public static final OmicronEnvironment BETA = new xr8();
    public static final OmicronEnvironment RELEASE = new yr8(4);

    String name();
}
