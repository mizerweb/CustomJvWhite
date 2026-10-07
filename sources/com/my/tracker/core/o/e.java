package com.my.tracker.core.o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public List a;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public e(List list) {
        this.a = new ArrayList(list);
    }
}
