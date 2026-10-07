package defpackage;

import one.me.chatscreen.ChatScreen;
import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class rb3 implements tf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = ((ns4) obj).a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((ChatScreen) this.b).j.e = 1;
                ((ChatScreen) this.b).j.j(str);
                ((ChatScreen) this.b).j.c = (la2) obj3;
                ((ChatScreen) this.b).j.g(na2.CHAT_HEAD, zBooleanValue);
                break;
            case 1:
                String str2 = ((ns4) obj).a;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((sa2) ((jsa) this.b).w1.getValue()).e = 1;
                ((sa2) ((jsa) this.b).w1.getValue()).j(str2);
                ((sa2) ((jsa) this.b).w1.getValue()).c = (la2) obj3;
                ((sa2) ((jsa) this.b).w1.getValue()).g(na2.ATTACH, zBooleanValue2);
                break;
            default:
                String str3 = ((ns4) obj).a;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ((sa2) ((ProfileScreen) this.b).z.getValue()).e = 1;
                ((sa2) ((ProfileScreen) this.b).z.getValue()).j(str3);
                ((sa2) ((ProfileScreen) this.b).z.getValue()).c = (la2) obj3;
                ((sa2) ((ProfileScreen) this.b).z.getValue()).g(na2.PROFILE, zBooleanValue3);
                break;
        }
        return sbi.a;
    }
}
