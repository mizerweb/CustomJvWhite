package defpackage;

import com.vk.push.core.filedatastore.FileDataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class nik {
    public final FileDataStore a;

    public nik(FileDataStore fileDataStore) {
        this.a = fileDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, nq4 nq4Var) {
        lik likVar;
        int i2;
        kik kikVar;
        boolean z;
        if (nq4Var instanceof lik) {
            likVar = (lik) nq4Var;
            int i3 = likVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                likVar.h = i3 - Integer.MIN_VALUE;
            } else {
                likVar = new lik(this, nq4Var);
            }
        } else {
            likVar = new lik(this, nq4Var);
        }
        Object obj = likVar.f;
        int i4 = likVar.h;
        hu4 hu4Var = hu4.a;
        if (i4 == 0) {
            ch3.d0(obj);
            likVar.d = this;
            likVar.e = i;
            likVar.h = 1;
            obj = this.a.read(likVar);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i4 == 1) {
            i = likVar.e;
            this = (nik) likVar.d;
            ch3.d0(obj);
        } else {
            if (i4 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = likVar.e;
            kikVar = (kik) likVar.d;
            ch3.d0(obj);
        }
        if (kikVar == null && kikVar.a == i2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
        kik kikVar2 = (kik) obj;
        FileDataStore fileDataStore = this.a;
        kik kikVar3 = new kik(i);
        likVar.d = kikVar2;
        likVar.e = i;
        likVar.h = 2;
        if (fileDataStore.write(kikVar3, likVar) != hu4Var) {
            i2 = i;
            kikVar = kikVar2;
            if (kikVar == null) {
                z = false;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
        return hu4Var;
    }
}
