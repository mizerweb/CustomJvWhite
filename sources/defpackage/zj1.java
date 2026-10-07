package defpackage;

import com.my.tracker.core.EngineCore;
import com.my.tracker.userlifecycle.o.a;
import java.io.IOException;
import java.util.Map;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.mediapicker.crop.CropPhotoScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zj1 implements t65, r89, qg4, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zj1(a aVar, Map map, boolean z, String str, String str2) {
        this.a = 5;
        this.c = aVar;
        this.f = map;
        this.b = z;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        ed7 ed7Var = (ed7) this.c;
        ((c5a) obj).e(ed7Var.b, (x4a) ed7Var.c, (t99) this.d, (uz9) this.e, (IOException) this.f, this.b);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((xf) obj).u((wf) this.c, (t99) this.d, (uz9) this.e, (IOException) this.f, this.b);
    }

    @Override // defpackage.t65
    public Object t() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                return new CallLinkInfoScreen((Long) obj3, (String) obj4, (String) obj, this.b, (ha9) obj2);
            case 1:
            default:
                return new CropPhotoScreen((String) obj4, (jx4) obj3, (ha9) obj2, this.b, (y3f) obj);
            case 2:
                return new FolderMemberPickerScreen((String) obj4, (String) obj, this.b, (long[]) obj3, (ha9) obj2);
        }
    }

    public /* synthetic */ zj1(Long l, String str, String str2, boolean z, ha9 ha9Var) {
        this.a = 0;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = ha9Var;
    }

    public /* synthetic */ zj1(Object obj, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = t99Var;
        this.e = uz9Var;
        this.f = iOException;
        this.b = z;
    }

    public /* synthetic */ zj1(String str, jx4 jx4Var, ha9 ha9Var, boolean z, y3f y3fVar) {
        this.a = 3;
        this.d = str;
        this.c = jx4Var;
        this.f = ha9Var;
        this.b = z;
        this.e = y3fVar;
    }

    public /* synthetic */ zj1(String str, String str2, boolean z, long[] jArr, ha9 ha9Var) {
        this.a = 2;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.c = jArr;
        this.f = ha9Var;
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return ((a) this.c).b((Map) this.f, this.b, (String) this.d, (String) this.e, insertEventTools);
    }
}
