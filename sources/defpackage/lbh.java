package defpackage;

import android.net.Uri;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.transloader.TranscodingUploader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lbh implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lbh(pbh pbhVar, obh obhVar, ArrayList arrayList, LinkedHashMap linkedHashMap, List list, ArrayList arrayList2) {
        this.a = 0;
        this.b = pbhVar;
        this.c = obhVar;
        this.d = arrayList;
        this.f = linkedHashMap;
        this.g = list;
        this.e = arrayList2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((pbh) obj6).a((obh) obj5, (ArrayList) obj4, (LinkedHashMap) obj2, (List) obj, (ArrayList) obj3));
            case 1:
                TranscodingUploader transcodingUploader = (TranscodingUploader) obj5;
                LinkedList linkedList = transcodingUploader.f;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                sfe sfeVar = (sfe) obj3;
                RandomAccessFile randomAccessFile = (RandomAccessFile) obj2;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj;
                if (((sfe) obj6).a) {
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-activeTranscodeCount>");
                    int i2 = transcodingUploader.e - 1;
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<set-activeTranscodeCount>");
                    transcodingUploader.e = i2;
                }
                transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.startNextTranscode");
                while (true) {
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-transLoadQueue>");
                    if (!linkedList.isEmpty()) {
                        transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-activeTranscodeCount>");
                        if (transcodingUploader.e < transcodingUploader.b.a) {
                            transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-transLoadQueue>");
                            l3i l3iVar = (l3i) linkedList.remove();
                            transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-activeTranscodeCount>");
                            int i3 = transcodingUploader.e + 1;
                            transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<set-activeTranscodeCount>");
                            transcodingUploader.e = i3;
                            l3iVar.a();
                        }
                    }
                }
                atomicBoolean.set(true);
                if (sfeVar.a) {
                    transcodingUploader.a(randomAccessFile, atomicBoolean2);
                }
                return sbi.a;
            default:
                wui wuiVar = (wui) obj5;
                d1e d1eVar = (d1e) obj3;
                c2a c2aVar = ((mvi) obj6).a;
                String str = wuiVar.c;
                String str2 = wuiVar.d;
                String str3 = wuiVar.e;
                fvi fviVar = ((xui) obj4).b;
                float f = fviVar.b;
                float f2 = fviVar.c;
                boolean z = fviVar.e;
                gvi gviVar = new gvi((vfe) obj2, (hvd) obj);
                h4c h4cVar = (h4c) c2aVar;
                h4cVar.q.set(true);
                if (!h4cVar.g.isEmpty()) {
                    h4cVar.f.post(new tr0(h4cVar, 1));
                }
                f4c f4cVar = new f4c(0, gviVar);
                try {
                    Uri uriM = l21.m(str2);
                    if (uriM == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    xzh xzhVarH = h4cVar.h(str, uriM, str3, f, f2, d1eVar, z, f4cVar);
                    h4cVar.d();
                    return xzhVarH;
                } catch (Throwable th) {
                    h4cVar.d();
                    throw th;
                }
        }
    }

    public /* synthetic */ lbh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
