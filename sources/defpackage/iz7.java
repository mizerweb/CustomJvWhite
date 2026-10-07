package defpackage;

import android.net.TrafficStats;
import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iz7 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wfe c;

    public /* synthetic */ iz7(String str, wfe wfeVar, int i) {
        this.a = i;
        this.b = str;
        this.c = wfeVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        wfe wfeVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                TrafficStats.setThreadStatsTag(str.hashCode());
                try {
                    ((Socket) wfeVar.a).connect(new InetSocketAddress(str, 443), 3000);
                    return sbiVar;
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            default:
                TrafficStats.setThreadStatsTag(str.hashCode());
                try {
                    ((Socket) wfeVar.a).connect(new InetSocketAddress(str, 443), 3000);
                    return sbiVar;
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
        }
    }
}
