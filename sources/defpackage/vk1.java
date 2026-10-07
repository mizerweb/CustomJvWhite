package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Pair;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vk1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vk1(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                dl1 dl1Var = (dl1) obj4;
                y8j y8jVar = (y8j) obj3;
                wre wreVar = (wre) obj2;
                qo7 qo7Var = (qo7) obj;
                int i3 = i2 + 1;
                if (!y8jVar.isInLayout()) {
                    wreVar.invoke();
                    return;
                } else if (i3 == 5) {
                    qo7Var.invoke();
                    return;
                } else {
                    y8jVar.post(new vk1(dl1Var, y8jVar, i3, wreVar, qo7Var, 0));
                    return;
                }
            case 1:
                pv9 pv9Var = (pv9) obj4;
                List list = (List) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (((AtomicInteger) obj3).incrementAndGet() == list.size()) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        e89 e89Var = (e89) arrayList.get(i4);
                        if (e89Var != null) {
                            try {
                                bitmap = (Bitmap) rx8.F(e89Var);
                            } catch (CancellationException | ExecutionException e) {
                                lvb.h0("MCImplLegacy", "Failed to get bitmap", e);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        qg7 qg7Var = pv9Var.i;
                        uv9 uv9VarF = mz8.f((ry9) list.get(i4), bitmap);
                        int i5 = i2 + i4;
                        mu9 mu9Var = (mu9) qg7Var.b;
                        if ((mu9Var.a.getFlags() & 4) != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, tab.h(uv9VarF, MediaDescriptionCompat.CREATOR));
                            bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i5);
                            mu9Var.a.sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
                        } else {
                            c.i("This session doesn't support queue management operations");
                        }
                        break;
                    }
                    return;
                }
                return;
            case 2:
                o3a o3aVar = (o3a) obj4;
                emf emfVar = (emf) obj3;
                p3a p3aVar = (p3a) obj2;
                n3a n3aVar = (n3a) obj;
                if (o3aVar.g.j()) {
                    return;
                }
                if (!((q2a) o3aVar.m.b).a.isActive()) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(emfVar == null ? Integer.valueOf(i2) : emfVar.b);
                    sb.append(", pid=");
                    sb.append(p3aVar.a.b);
                    lvb.G0("MediaSessionLegacyStub", sb.toString());
                    return;
                }
                i2a i2aVarJ = o3aVar.J(p3aVar);
                gvb gvbVar = o3aVar.f;
                if (emfVar != null) {
                    if (!gvbVar.P(i2aVarJ, emfVar)) {
                        return;
                    }
                } else if (!gvbVar.O(i2aVarJ, i2)) {
                    return;
                }
                try {
                    n3aVar.b(i2aVarJ);
                    return;
                } catch (RemoteException e2) {
                    lvb.H0("MediaSessionLegacyStub", "Exception in " + i2aVarJ, e2);
                    return;
                }
            case 3:
                Pair pair = (Pair) obj3;
                ((r75) ((k5a) obj4).b.i).n(((Integer) pair.first).intValue(), (x4a) pair.second, (t99) obj2, (uz9) obj, this.b);
                return;
            default:
                ih ihVar = (ih) obj3;
                Uri uri = (Uri) obj2;
                String str = (String) obj;
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(((File) obj4).getPath(), "r");
                    try {
                        boolean zD = new dki(uri, randomAccessFile, str, 1, new cki(2097152, i2), ihVar, null, new ku8()).d();
                        randomAccessFile.close();
                        if (zD) {
                            ihVar.C();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(randomAccessFile, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    ihVar.F(th3);
                    return;
                }
        }
    }

    public /* synthetic */ vk1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
