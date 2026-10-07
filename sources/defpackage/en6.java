package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en6 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ en6(ArrayList arrayList, int i, String str) {
        this.a = 0;
        this.c = str;
        this.d = arrayList;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:9:0x0033, B:10:0x0039, B:12:0x003f, B:15:0x004e, B:16:0x00b1, B:18:0x00b7, B:20:0x00d8, B:23:0x00e5, B:27:0x00f1, B:31:0x0105, B:35:0x011c, B:39:0x012a, B:38:0x0125, B:34:0x0112, B:30:0x00fb), top: B:45:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x010f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0112 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:9:0x0033, B:10:0x0039, B:12:0x003f, B:15:0x004e, B:16:0x00b1, B:18:0x00b7, B:20:0x00d8, B:23:0x00e5, B:27:0x00f1, B:31:0x0105, B:35:0x011c, B:39:0x012a, B:38:0x0125, B:34:0x0112, B:30:0x00fb), top: B:45:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0125 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:9:0x0033, B:10:0x0039, B:12:0x003f, B:15:0x004e, B:16:0x00b1, B:18:0x00b7, B:20:0x00d8, B:23:0x00e5, B:27:0x00f1, B:31:0x0105, B:35:0x011c, B:39:0x012a, B:38:0x0125, B:34:0x0112, B:30:0x00fb), top: B:45:0x0033 }] */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i;
        Long lValueOf;
        Long lValueOf2;
        int i2 = this.a;
        Object obj2 = this.d;
        int i3 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0((String) obj3);
                try {
                    Iterator it = arrayList.iterator();
                    int i4 = 1;
                    while (it.hasNext()) {
                        vxeVarO0.B(i4, (String) it.next());
                        i4++;
                    }
                    vxeVarO0.c(i3 + 1, qt4.D(2));
                    int iE = qyj.E(vxeVarO0, "push_id");
                    int iE2 = qyj.E(vxeVarO0, "msg_id");
                    int iE3 = qyj.E(vxeVarO0, "analytics_status");
                    int iE4 = qyj.E(vxeVarO0, "suid");
                    int iE5 = qyj.E(vxeVarO0, "content_length");
                    int iE6 = qyj.E(vxeVarO0, "sent_time");
                    int iE7 = qyj.E(vxeVarO0, "event_key");
                    int iE8 = qyj.E(vxeVarO0, "fcm_sent_time");
                    int iE9 = qyj.E(vxeVarO0, "received_time");
                    int iE10 = qyj.E(vxeVarO0, "push_type");
                    int iE11 = qyj.E(vxeVarO0, "time");
                    int iE12 = qyj.E(vxeVarO0, "created_time");
                    int iE13 = qyj.E(vxeVarO0, "chat_id");
                    int iE14 = qyj.E(vxeVarO0, "post_id");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j = vxeVarO0.getLong(iE);
                        long j2 = vxeVarO0.getLong(iE2);
                        ArrayList arrayList3 = arrayList2;
                        int i5 = iE2;
                        int i6 = (int) vxeVarO0.getLong(iE3);
                        int[] iArrH = qt4.H(3);
                        int i7 = iE;
                        int length = iArrH.length;
                        int i8 = 0;
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = iArrH[i9];
                            int i11 = length;
                            if (qt4.D(i10) == i6) {
                                i8 = i10;
                                if (i8 == 0) {
                                    i = 1;
                                } else {
                                    i = i8;
                                }
                                if (vxeVarO0.isNull(iE4)) {
                                    lValueOf = null;
                                } else {
                                    lValueOf = Long.valueOf(vxeVarO0.getLong(iE4));
                                }
                                long j3 = vxeVarO0.getLong(iE5);
                                if (vxeVarO0.isNull(iE6)) {
                                    lValueOf2 = null;
                                } else {
                                    lValueOf2 = Long.valueOf(vxeVarO0.getLong(iE6));
                                }
                                int i12 = iE3;
                                int i13 = iE4;
                                arrayList2 = arrayList3;
                                arrayList2.add(new hn6(j, new ilb(vxeVarO0.getLong(iE13), vxeVarO0.getLong(iE14)), j2, i, lValueOf, j3, lValueOf2, vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7), vxeVarO0.getLong(iE8), vxeVarO0.getLong(iE9), vxeVarO0.B0(iE10), vxeVarO0.getLong(iE11), vxeVarO0.getLong(iE12)));
                                iE2 = i5;
                                iE = i7;
                                iE4 = i13;
                                iE3 = i12;
                            } else {
                                i9++;
                                length = i11;
                            }
                        }
                        if (i8 == 0) {
                            i = 1;
                        } else {
                            i = i8;
                        }
                        if (vxeVarO0.isNull(iE4)) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(vxeVarO0.getLong(iE4));
                        }
                        long j4 = vxeVarO0.getLong(iE5);
                        if (vxeVarO0.isNull(iE6)) {
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(vxeVarO0.getLong(iE6));
                        }
                        int i14 = iE3;
                        int i15 = iE4;
                        arrayList2 = arrayList3;
                        arrayList2.add(new hn6(j, new ilb(vxeVarO0.getLong(iE13), vxeVarO0.getLong(iE14)), j2, i, lValueOf, j4, lValueOf2, vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7), vxeVarO0.getLong(iE8), vxeVarO0.getLong(iE9), vxeVarO0.B0(iE10), vxeVarO0.getLong(iE11), vxeVarO0.getLong(iE12)));
                        iE2 = i5;
                        iE = i7;
                        iE4 = i15;
                        iE3 = i14;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                return Widget.childRouter$lambda$0((Widget) obj3, i3, (cf7) obj2, (hve) obj);
            default:
                return WorkersQueueDao_Impl.updateState$lambda$0((String) obj3, i3, (List) obj2, (qxe) obj);
        }
    }

    public /* synthetic */ en6(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
