package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.folders.usecases.ImpossibleLocalCacheStateException;
import ru.ok.tamtam.folders.usecases.ImpossibleNotifException;

/* JADX INFO: loaded from: classes.dex */
public final class iy4 extends mdh implements qf7 {
    public sy4 e;
    public Object f;
    public List g;
    public Object h;
    public j9b i;
    public j9b j;
    public j9b k;
    public ArrayList l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final /* synthetic */ sy4 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ List u;
    public final /* synthetic */ u8b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy4(sy4 sy4Var, long j, List list, u8b u8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.s = sy4Var;
        this.t = j;
        this.u = list;
        this.v = u8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new iy4(this.s, this.t, this.u, this.v, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((iy4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x034e A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x035f A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x038e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0390  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x03be A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:114:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:116:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0400 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0479 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x048b A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x049d A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:147:0x0515  */
    /* JADX WARN: Code duplicated, block: B:148:0x0516  */
    /* JADX WARN: Code duplicated, block: B:150:0x051a  */
    /* JADX WARN: Code duplicated, block: B:151:0x051b  */
    /* JADX WARN: Code duplicated, block: B:155:0x053e A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x054d A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0580  */
    /* JADX WARN: Code duplicated, block: B:177:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x04a6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e2 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ec A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:57:0x0234 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x023c A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x024a A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0253  */
    /* JADX WARN: Code duplicated, block: B:66:0x0259  */
    /* JADX WARN: Code duplicated, block: B:69:0x0266 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0277 A[Catch: all -> 0x0211, LOOP:4: B:68:0x0264->B:72:0x0277, LOOP_END, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0284 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ad A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x02c0 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x02cd A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02e4 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f5 A[Catch: all -> 0x0211, LOOP:6: B:84:0x02e2->B:88:0x02f5, LOOP_END, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0302 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0327 A[Catch: all -> 0x0211, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0335 A[Catch: all -> 0x0211, LOOP:5: B:80:0x02cb->B:94:0x0335, LOOP_END, TryCatch #1 {all -> 0x0211, blocks: (B:164:0x0583, B:152:0x0523, B:153:0x0538, B:155:0x053e, B:157:0x054d, B:159:0x0553, B:145:0x04dd, B:131:0x0470, B:133:0x0479, B:135:0x048b, B:137:0x049d, B:139:0x04a3, B:140:0x04a6, B:141:0x04ae, B:117:0x03fa, B:119:0x0400, B:121:0x0406, B:123:0x0416, B:124:0x0432, B:109:0x03b8, B:111:0x03be, B:45:0x01d1, B:54:0x021a, B:55:0x022e, B:57:0x0234, B:59:0x023c, B:61:0x024a, B:67:0x025b, B:69:0x0266, B:74:0x027e, B:76:0x0284, B:77:0x02ad, B:72:0x0277, B:79:0x02c0, B:81:0x02cd, B:83:0x02dd, B:85:0x02e4, B:90:0x02fc, B:92:0x0302, B:93:0x0327, B:88:0x02f5, B:94:0x0335, B:96:0x0342, B:97:0x0347, B:100:0x034e, B:101:0x0359, B:103:0x035f, B:48:0x01e2, B:50:0x01ec), top: B:171:0x01d1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x01ec, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x0302, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x010d: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:31:0x010d */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00aa: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:22:0x00aa */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        j9b j9bVar;
        j9b j9bVar2;
        j9b j9bVar3;
        Object obj2;
        sy4 sy4Var;
        long j;
        List list;
        u8b u8bVar;
        sy4 sy4Var2;
        int i;
        l9b l9bVar;
        u8b u8bVar2;
        List list2;
        sy4 sy4Var3;
        int i2;
        long j2;
        sy4 sy4Var4;
        int i3;
        j9b j9bVar4;
        String str;
        a4c a4cVar;
        List list3;
        je9 je9Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        int i4;
        boolean z;
        int i5;
        hu4 hu4Var;
        int i6;
        int i7;
        List list4;
        int i8;
        j9b j9bVar5;
        long j3;
        sy4 sy4Var5;
        int i9;
        int i10;
        ArrayList arrayList3;
        int i11;
        j9b j9bVar6;
        int i12;
        Object next;
        int i13;
        String str2;
        f9b f9bVar;
        r17 r17Var;
        boolean z2;
        int i14;
        int i15;
        Object[] objArr;
        int i16;
        int i17;
        Object[] objArr2;
        Object[] objArr3;
        int i18;
        int i19;
        Object obj3;
        vy2 vy2Var;
        Object[] objArr4;
        Object[] objArr5;
        int i20;
        int i21;
        Object obj4;
        vy2 vy2Var2;
        int i22;
        int i23;
        sy4 sy4Var6;
        int i24;
        int i25;
        j9b j9bVar7;
        int i26;
        List list5;
        j9b j9bVar8;
        int i27;
        int i28;
        sy4 sy4Var7;
        c9b c9bVar;
        Object[] objArr6;
        int i29;
        int i30;
        String str3;
        int i31;
        int i32;
        String str4;
        String str5;
        List list6;
        int i33;
        int i34;
        Object objH;
        int i35;
        sy4 sy4Var8;
        int i36;
        int i37;
        long j4;
        ArrayList arrayList4;
        Iterator it2;
        pzf pzfVar;
        u8b u8bVar3;
        sy4 sy4Var9;
        Object next2;
        sbi sbiVar = sbi.a;
        hu4 hu4Var2 = hu4.a;
        String str6 = "all.chat.folder";
        try {
            try {
                switch (this.r) {
                    case 0:
                        ch3.d0(obj);
                        sy4Var = this.s;
                        j = this.t;
                        list = this.u;
                        u8bVar = this.v;
                        i64 i64Var = sy4Var.o;
                        this.e = sy4Var;
                        this.f = sy4Var;
                        this.g = list;
                        this.h = u8bVar;
                        this.m = j;
                        this.n = 0;
                        this.r = 1;
                        if (i64Var.p(this) != hu4Var2) {
                            sy4Var2 = sy4Var;
                            i = 0;
                            l9bVar = sy4Var2.p;
                            this.e = sy4Var2;
                            this.f = sy4Var;
                            this.g = list;
                            this.h = u8bVar;
                            this.i = l9bVar;
                            this.m = j;
                            this.n = i;
                            this.o = 0;
                            this.r = 2;
                            if (l9bVar.b(this) != hu4Var2) {
                                u8bVar2 = u8bVar;
                                list2 = list;
                                sy4Var3 = sy4Var;
                                i2 = i;
                                j2 = j;
                                sy4Var4 = sy4Var2;
                                j9bVar2 = l9bVar;
                                i3 = 0;
                                try {
                                    j9bVar4 = sy4Var4.p;
                                    str = sy4Var3.c;
                                    a4cVar = gm0.f;
                                    if (a4cVar == null) {
                                        list3 = list2;
                                    } else {
                                        list3 = list2;
                                        je9Var = je9.d;
                                        if (a4cVar.b(je9Var)) {
                                            a4cVar.c(je9Var, str, "handleServerChanges: folders=" + u8bVar2.b + ", foldersOrder=" + list3.size(), null);
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList2 = new ArrayList();
                                    it = list3.iterator();
                                    i4 = 0;
                                    z = false;
                                    while (it.hasNext()) {
                                        next = it.next();
                                        i13 = i4 + 1;
                                        if (i4 < 0) {
                                            xw3.V0();
                                            throw null;
                                        }
                                        str2 = (String) next;
                                        Iterator it3 = it;
                                        f9bVar = (f9b) sy4Var3.k.get(str2);
                                        if (f9bVar != null) {
                                            r17Var = (r17) f9bVar.getValue();
                                        } else {
                                            r17Var = null;
                                        }
                                        if (r17Var == null) {
                                            z2 = z;
                                            objArr5 = u8bVar2.a;
                                            i20 = u8bVar2.b;
                                            i15 = i13;
                                            i21 = 0;
                                            while (true) {
                                                if (i21 < i20) {
                                                    obj4 = objArr5[i21];
                                                    i22 = i20;
                                                    if (!((vy2) obj4).a.equals(str2)) {
                                                        i21++;
                                                        i20 = i22;
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            vy2Var2 = (vy2) obj4;
                                            if (vy2Var2 == null) {
                                                ed6 ed6Var = (ed6) sy4Var3.f.getValue();
                                                StringBuilder sb = new StringBuilder();
                                                i14 = i2;
                                                sb.append("Got folder in foldersOrder, but not in local folders (");
                                                sb.append(str2);
                                                sb.append(")");
                                                npk.a(ed6Var, new ImpossibleLocalCacheStateException(sb.toString()));
                                                z = true;
                                            } else {
                                                i14 = i2;
                                                arrayList.add(new ylc(new Integer(i4), vy2Var2));
                                            }
                                            it = it3;
                                            i2 = i14;
                                            i4 = i15;
                                        } else {
                                            z2 = z;
                                            i14 = i2;
                                            i15 = i13;
                                            objArr = u8bVar2.a;
                                            i16 = u8bVar2.b;
                                            i17 = 0;
                                            while (i17 < i16) {
                                                objArr2 = objArr;
                                                if (((vy2) objArr[i17]).a.equals(str2)) {
                                                    objArr3 = u8bVar2.a;
                                                    i18 = u8bVar2.b;
                                                    i19 = 0;
                                                    while (true) {
                                                        if (i19 < i18) {
                                                            obj3 = objArr3[i19];
                                                            objArr4 = objArr3;
                                                            if (!((vy2) obj3).a.equals(str2)) {
                                                                i19++;
                                                                objArr3 = objArr4;
                                                            }
                                                        } else {
                                                            obj3 = null;
                                                        }
                                                    }
                                                    vy2Var = (vy2) obj3;
                                                    if (vy2Var == null) {
                                                        npk.a((ed6) sy4Var3.f.getValue(), new ImpossibleNotifException("Got folder in foldersOrder, but not in folders (" + str2 + ")"));
                                                    } else {
                                                        arrayList2.add(new ylc(new Integer(i4), vy2Var));
                                                    }
                                                } else {
                                                    i17++;
                                                    objArr = objArr2;
                                                }
                                            }
                                        }
                                        z = z2;
                                        it = it3;
                                        i2 = i14;
                                        i4 = i15;
                                    }
                                    i5 = i2;
                                    if (z) {
                                        ((b47) sy4Var3.i.getValue()).a();
                                    }
                                    if (arrayList.isEmpty()) {
                                        hu4Var = hu4Var2;
                                        i6 = i5;
                                        i7 = i3;
                                        list4 = list3;
                                        i8 = 0;
                                        j9bVar5 = j9bVar4;
                                        j3 = j2;
                                        sy4Var5 = sy4Var4;
                                        i9 = 0;
                                    } else {
                                        this.e = sy4Var4;
                                        this.f = sy4Var3;
                                        this.g = list3;
                                        this.h = u8bVar2;
                                        this.i = j9bVar2;
                                        this.j = null;
                                        this.k = j9bVar4;
                                        this.l = arrayList2;
                                        this.m = j2;
                                        this.n = i5;
                                        i10 = i3;
                                        this.o = i10;
                                        this.p = 0;
                                        this.q = 0;
                                        this.r = 3;
                                        hu4Var = hu4Var2;
                                        if (sy4.b(sy4Var3, arrayList, this) == hu4Var) {
                                            return hu4Var;
                                        }
                                        arrayList3 = arrayList2;
                                        i11 = i5;
                                        i7 = i10;
                                        list4 = list3;
                                        j9bVar6 = j9bVar2;
                                        i8 = 0;
                                        i12 = 0;
                                        long j5 = j2;
                                        sy4Var5 = sy4Var4;
                                        i9 = i12;
                                        j9bVar2 = j9bVar6;
                                        j9bVar5 = j9bVar4;
                                        j3 = j5;
                                        ArrayList arrayList5 = arrayList3;
                                        i6 = i11;
                                        arrayList2 = arrayList5;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        i23 = i7;
                                        sy4Var6 = sy4Var5;
                                        i24 = i6;
                                    } else {
                                        this.e = sy4Var5;
                                        this.f = sy4Var3;
                                        this.g = list4;
                                        this.h = u8bVar2;
                                        this.i = j9bVar2;
                                        this.j = null;
                                        this.k = j9bVar5;
                                        this.l = null;
                                        this.m = j3;
                                        this.n = i6;
                                        this.o = i7;
                                        this.p = i9;
                                        this.q = i8;
                                        this.r = 4;
                                        if (sy4.e(sy4Var3, arrayList2, this) == hu4Var) {
                                            return hu4Var;
                                        }
                                        j9b j9bVar9 = j9bVar2;
                                        i25 = i9;
                                        j9bVar7 = j9bVar9;
                                        i26 = i6;
                                        int i38 = i25;
                                        j9bVar2 = j9bVar7;
                                        i9 = i38;
                                        int i39 = i26;
                                        i23 = i7;
                                        sy4Var6 = sy4Var5;
                                        i24 = i39;
                                    }
                                    if (list4.isEmpty() || !u8bVar2.j()) {
                                        list5 = list4;
                                    } else {
                                        ArrayList arrayList6 = new ArrayList(u8bVar2.b);
                                        Object[] objArr7 = u8bVar2.a;
                                        int i40 = 0;
                                        for (int i41 = u8bVar2.b; i40 < i41; i41 = i41) {
                                            arrayList6.add(new ylc(null, (vy2) objArr7[i40]));
                                            i40++;
                                            list4 = list4;
                                        }
                                        List list7 = list4;
                                        List listUnmodifiableList = Collections.unmodifiableList(arrayList6);
                                        this.e = sy4Var6;
                                        this.f = sy4Var3;
                                        this.g = list7;
                                        this.h = j9bVar2;
                                        this.i = null;
                                        this.j = j9bVar5;
                                        this.k = null;
                                        this.l = null;
                                        this.m = j3;
                                        this.n = i24;
                                        this.o = i23;
                                        this.p = i9;
                                        this.q = i8;
                                        this.r = 5;
                                        if (sy4.e(sy4Var3, listUnmodifiableList, this) == hu4Var) {
                                            return hu4Var;
                                        }
                                        list5 = list7;
                                        j9bVar8 = j9bVar2;
                                        i27 = i9;
                                        i9 = i27;
                                        j9bVar2 = j9bVar8;
                                    }
                                    i28 = i24;
                                    sy4Var7 = sy4Var6;
                                    if (!list5.isEmpty()) {
                                        c9b c9bVar2 = r1f.a;
                                        c9bVar = new c9b();
                                        u8b u8bVar4 = sy4Var3.l;
                                        objArr6 = u8bVar4.a;
                                        i29 = u8bVar4.b;
                                        i30 = 0;
                                        while (i30 < i29) {
                                            int i42 = i29;
                                            str4 = (String) objArr6[i30];
                                            int i43 = i30;
                                            str5 = str6;
                                            if (cqk.d(str4, str5) && !list5.contains(str4)) {
                                                c9bVar.a(str4);
                                            }
                                            str6 = str5;
                                            i30 = i43 + 1;
                                            i29 = i42;
                                        }
                                        str3 = str6;
                                        this.e = sy4Var7;
                                        this.f = sy4Var3;
                                        this.g = list5;
                                        this.h = j9bVar2;
                                        this.i = null;
                                        this.j = j9bVar5;
                                        this.k = null;
                                        this.l = null;
                                        this.m = j3;
                                        this.n = i28;
                                        this.o = i23;
                                        this.p = i9;
                                        this.q = i8;
                                        this.r = 6;
                                        if (sy4.d(sy4Var3, c9bVar, this) == hu4Var) {
                                            return hu4Var;
                                        }
                                        i31 = i23;
                                        i32 = i28;
                                        j9b j9bVar10 = j9bVar5;
                                        list6 = list5;
                                        bre breVarK = sy4Var3.k();
                                        this.e = sy4Var7;
                                        this.f = sy4Var3;
                                        this.g = list6;
                                        this.h = j9bVar2;
                                        this.i = null;
                                        this.j = j9bVar10;
                                        this.k = null;
                                        this.l = null;
                                        this.m = j3;
                                        this.n = i32;
                                        this.o = i31;
                                        this.p = i9;
                                        this.q = i8;
                                        this.r = 7;
                                        i33 = i9;
                                        i34 = i8;
                                        objH = ch3.H(this, new vy6(breVarK, list6, null, 2), breVarK.a);
                                        if (objH != hu4Var) {
                                            objH = sbiVar;
                                        }
                                        if (objH == hu4Var) {
                                            return hu4Var;
                                        }
                                        i35 = i31;
                                        sy4Var8 = sy4Var7;
                                        i36 = i34;
                                        i37 = i33;
                                        j4 = j3;
                                        u8b u8bVar5 = sy4Var3.l;
                                        u8bVar5.f();
                                        u8bVar5.b(str3);
                                        u8b u8bVar6 = sy4Var3.l;
                                        arrayList4 = new ArrayList();
                                        it2 = list6.iterator();
                                        while (it2.hasNext()) {
                                            next2 = it2.next();
                                            Iterator it4 = it2;
                                            if (!cqk.d((String) next2, str3)) {
                                                arrayList4.add(next2);
                                            }
                                            it2 = it4;
                                        }
                                        u8bVar6.d(arrayList4);
                                        pzfVar = sy4Var3.m;
                                        u8bVar3 = sy4Var3.l;
                                        this.e = sy4Var8;
                                        this.f = j9bVar2;
                                        this.g = null;
                                        this.h = null;
                                        this.i = null;
                                        this.j = null;
                                        this.k = null;
                                        this.l = null;
                                        this.m = j4;
                                        this.n = i32;
                                        this.o = i35;
                                        this.p = i37;
                                        this.q = i36;
                                        this.r = 8;
                                        if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                            return hu4Var;
                                        }
                                        sy4Var9 = sy4Var8;
                                        sy4Var7 = sy4Var9;
                                        j3 = j4;
                                    }
                                    ((xb9) sy4Var7.i()).h0(j3);
                                    j9bVar2.g(null);
                                    return sbiVar;
                                } catch (Throwable th) {
                                    th = th;
                                    obj2 = null;
                                    j9bVar2.g(obj2);
                                    throw th;
                                }
                            }
                        }
                        return hu4Var2;
                    case 1:
                        i = this.n;
                        j = this.m;
                        u8bVar = (u8b) this.h;
                        list = this.g;
                        sy4Var = (sy4) this.f;
                        sy4Var2 = this.e;
                        ch3.d0(obj);
                        l9bVar = sy4Var2.p;
                        this.e = sy4Var2;
                        this.f = sy4Var;
                        this.g = list;
                        this.h = u8bVar;
                        this.i = l9bVar;
                        this.m = j;
                        this.n = i;
                        this.o = 0;
                        this.r = 2;
                        if (l9bVar.b(this) != hu4Var2) {
                            u8bVar2 = u8bVar;
                            list2 = list;
                            sy4Var3 = sy4Var;
                            i2 = i;
                            j2 = j;
                            sy4Var4 = sy4Var2;
                            j9bVar2 = l9bVar;
                            i3 = 0;
                            j9bVar4 = sy4Var4.p;
                            str = sy4Var3.c;
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                list3 = list2;
                            } else {
                                list3 = list2;
                                je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "handleServerChanges: folders=" + u8bVar2.b + ", foldersOrder=" + list3.size(), null);
                                }
                            }
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            it = list3.iterator();
                            i4 = 0;
                            z = false;
                            while (it.hasNext()) {
                                next = it.next();
                                i13 = i4 + 1;
                                if (i4 < 0) {
                                    xw3.V0();
                                    throw null;
                                }
                                str2 = (String) next;
                                Iterator it5 = it;
                                f9bVar = (f9b) sy4Var3.k.get(str2);
                                if (f9bVar != null) {
                                    r17Var = (r17) f9bVar.getValue();
                                } else {
                                    r17Var = null;
                                }
                                if (r17Var == null) {
                                    z2 = z;
                                    objArr5 = u8bVar2.a;
                                    i20 = u8bVar2.b;
                                    i15 = i13;
                                    i21 = 0;
                                    while (true) {
                                        if (i21 < i20) {
                                            obj4 = objArr5[i21];
                                            i22 = i20;
                                            if (!((vy2) obj4).a.equals(str2)) {
                                                i21++;
                                                i20 = i22;
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    vy2Var2 = (vy2) obj4;
                                    if (vy2Var2 == null) {
                                        ed6 ed6Var2 = (ed6) sy4Var3.f.getValue();
                                        StringBuilder sb2 = new StringBuilder();
                                        i14 = i2;
                                        sb2.append("Got folder in foldersOrder, but not in local folders (");
                                        sb2.append(str2);
                                        sb2.append(")");
                                        npk.a(ed6Var2, new ImpossibleLocalCacheStateException(sb2.toString()));
                                        z = true;
                                    } else {
                                        i14 = i2;
                                        arrayList.add(new ylc(new Integer(i4), vy2Var2));
                                    }
                                    it = it5;
                                    i2 = i14;
                                    i4 = i15;
                                } else {
                                    z2 = z;
                                    i14 = i2;
                                    i15 = i13;
                                    objArr = u8bVar2.a;
                                    i16 = u8bVar2.b;
                                    i17 = 0;
                                    while (i17 < i16) {
                                        objArr2 = objArr;
                                        if (((vy2) objArr[i17]).a.equals(str2)) {
                                            objArr3 = u8bVar2.a;
                                            i18 = u8bVar2.b;
                                            i19 = 0;
                                            while (true) {
                                                if (i19 < i18) {
                                                    obj3 = objArr3[i19];
                                                    objArr4 = objArr3;
                                                    if (!((vy2) obj3).a.equals(str2)) {
                                                        i19++;
                                                        objArr3 = objArr4;
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            vy2Var = (vy2) obj3;
                                            if (vy2Var == null) {
                                                npk.a((ed6) sy4Var3.f.getValue(), new ImpossibleNotifException("Got folder in foldersOrder, but not in folders (" + str2 + ")"));
                                            } else {
                                                arrayList2.add(new ylc(new Integer(i4), vy2Var));
                                            }
                                        } else {
                                            i17++;
                                            objArr = objArr2;
                                        }
                                    }
                                }
                                z = z2;
                                it = it5;
                                i2 = i14;
                                i4 = i15;
                            }
                            i5 = i2;
                            if (z) {
                                ((b47) sy4Var3.i.getValue()).a();
                            }
                            if (arrayList.isEmpty()) {
                                this.e = sy4Var4;
                                this.f = sy4Var3;
                                this.g = list3;
                                this.h = u8bVar2;
                                this.i = j9bVar2;
                                this.j = null;
                                this.k = j9bVar4;
                                this.l = arrayList2;
                                this.m = j2;
                                this.n = i5;
                                i10 = i3;
                                this.o = i10;
                                this.p = 0;
                                this.q = 0;
                                this.r = 3;
                                hu4Var = hu4Var2;
                                if (sy4.b(sy4Var3, arrayList, this) == hu4Var) {
                                    return hu4Var;
                                }
                                arrayList3 = arrayList2;
                                i11 = i5;
                                i7 = i10;
                                list4 = list3;
                                j9bVar6 = j9bVar2;
                                i8 = 0;
                                i12 = 0;
                                long j6 = j2;
                                sy4Var5 = sy4Var4;
                                i9 = i12;
                                j9bVar2 = j9bVar6;
                                j9bVar5 = j9bVar4;
                                j3 = j6;
                                ArrayList arrayList7 = arrayList3;
                                i6 = i11;
                                arrayList2 = arrayList7;
                            } else {
                                hu4Var = hu4Var2;
                                i6 = i5;
                                i7 = i3;
                                list4 = list3;
                                i8 = 0;
                                j9bVar5 = j9bVar4;
                                j3 = j2;
                                sy4Var5 = sy4Var4;
                                i9 = 0;
                            }
                            if (arrayList2.isEmpty()) {
                                this.e = sy4Var5;
                                this.f = sy4Var3;
                                this.g = list4;
                                this.h = u8bVar2;
                                this.i = j9bVar2;
                                this.j = null;
                                this.k = j9bVar5;
                                this.l = null;
                                this.m = j3;
                                this.n = i6;
                                this.o = i7;
                                this.p = i9;
                                this.q = i8;
                                this.r = 4;
                                if (sy4.e(sy4Var3, arrayList2, this) == hu4Var) {
                                    return hu4Var;
                                }
                                j9b j9bVar11 = j9bVar2;
                                i25 = i9;
                                j9bVar7 = j9bVar11;
                                i26 = i6;
                                int i310 = i25;
                                j9bVar2 = j9bVar7;
                                i9 = i310;
                                int i311 = i26;
                                i23 = i7;
                                sy4Var6 = sy4Var5;
                                i24 = i311;
                            } else {
                                i23 = i7;
                                sy4Var6 = sy4Var5;
                                i24 = i6;
                            }
                            if (list4.isEmpty()) {
                                break;
                            }
                            list5 = list4;
                            i28 = i24;
                            sy4Var7 = sy4Var6;
                            if (!list5.isEmpty()) {
                                c9b c9bVar3 = r1f.a;
                                c9bVar = new c9b();
                                u8b u8bVar7 = sy4Var3.l;
                                objArr6 = u8bVar7.a;
                                i29 = u8bVar7.b;
                                i30 = 0;
                                while (i30 < i29) {
                                    int i44 = i29;
                                    str4 = (String) objArr6[i30];
                                    int i45 = i30;
                                    str5 = str6;
                                    if (cqk.d(str4, str5)) {
                                    }
                                    str6 = str5;
                                    i30 = i45 + 1;
                                    i29 = i44;
                                }
                                str3 = str6;
                                this.e = sy4Var7;
                                this.f = sy4Var3;
                                this.g = list5;
                                this.h = j9bVar2;
                                this.i = null;
                                this.j = j9bVar5;
                                this.k = null;
                                this.l = null;
                                this.m = j3;
                                this.n = i28;
                                this.o = i23;
                                this.p = i9;
                                this.q = i8;
                                this.r = 6;
                                if (sy4.d(sy4Var3, c9bVar, this) == hu4Var) {
                                    return hu4Var;
                                }
                                i31 = i23;
                                i32 = i28;
                                j9b j9bVar12 = j9bVar5;
                                list6 = list5;
                                bre breVarK2 = sy4Var3.k();
                                this.e = sy4Var7;
                                this.f = sy4Var3;
                                this.g = list6;
                                this.h = j9bVar2;
                                this.i = null;
                                this.j = j9bVar12;
                                this.k = null;
                                this.l = null;
                                this.m = j3;
                                this.n = i32;
                                this.o = i31;
                                this.p = i9;
                                this.q = i8;
                                this.r = 7;
                                i33 = i9;
                                i34 = i8;
                                objH = ch3.H(this, new vy6(breVarK2, list6, null, 2), breVarK2.a);
                                if (objH != hu4Var) {
                                    objH = sbiVar;
                                }
                                if (objH == hu4Var) {
                                    return hu4Var;
                                }
                                i35 = i31;
                                sy4Var8 = sy4Var7;
                                i36 = i34;
                                i37 = i33;
                                j4 = j3;
                                u8b u8bVar8 = sy4Var3.l;
                                u8bVar8.f();
                                u8bVar8.b(str3);
                                u8b u8bVar9 = sy4Var3.l;
                                arrayList4 = new ArrayList();
                                it2 = list6.iterator();
                                while (it2.hasNext()) {
                                    next2 = it2.next();
                                    Iterator it6 = it2;
                                    if (!cqk.d((String) next2, str3)) {
                                        arrayList4.add(next2);
                                    }
                                    it2 = it6;
                                }
                                u8bVar9.d(arrayList4);
                                pzfVar = sy4Var3.m;
                                u8bVar3 = sy4Var3.l;
                                this.e = sy4Var8;
                                this.f = j9bVar2;
                                this.g = null;
                                this.h = null;
                                this.i = null;
                                this.j = null;
                                this.k = null;
                                this.l = null;
                                this.m = j4;
                                this.n = i32;
                                this.o = i35;
                                this.p = i37;
                                this.q = i36;
                                this.r = 8;
                                if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                    return hu4Var;
                                }
                                sy4Var9 = sy4Var8;
                                sy4Var7 = sy4Var9;
                                j3 = j4;
                            }
                            ((xb9) sy4Var7.i()).h0(j3);
                            j9bVar2.g(null);
                            return sbiVar;
                        }
                        return hu4Var2;
                    case 2:
                        sbiVar = sbiVar;
                        int i46 = this.o;
                        int i47 = this.n;
                        long j7 = this.m;
                        j9b j9bVar13 = this.i;
                        u8b u8bVar10 = (u8b) this.h;
                        List list8 = this.g;
                        sy4 sy4Var10 = (sy4) this.f;
                        sy4 sy4Var11 = this.e;
                        ch3.d0(obj);
                        i3 = i46;
                        sy4Var4 = sy4Var11;
                        u8bVar2 = u8bVar10;
                        j2 = j7;
                        i2 = i47;
                        j9bVar2 = j9bVar13;
                        list2 = list8;
                        sy4Var3 = sy4Var10;
                        j9bVar4 = sy4Var4.p;
                        str = sy4Var3.c;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            list3 = list2;
                        } else {
                            list3 = list2;
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "handleServerChanges: folders=" + u8bVar2.b + ", foldersOrder=" + list3.size(), null);
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        it = list3.iterator();
                        i4 = 0;
                        z = false;
                        while (it.hasNext()) {
                            next = it.next();
                            i13 = i4 + 1;
                            if (i4 < 0) {
                                xw3.V0();
                                throw null;
                            }
                            str2 = (String) next;
                            Iterator it7 = it;
                            f9bVar = (f9b) sy4Var3.k.get(str2);
                            if (f9bVar != null) {
                                r17Var = (r17) f9bVar.getValue();
                            } else {
                                r17Var = null;
                            }
                            if (r17Var == null) {
                                z2 = z;
                                objArr5 = u8bVar2.a;
                                i20 = u8bVar2.b;
                                i15 = i13;
                                i21 = 0;
                                while (true) {
                                    if (i21 < i20) {
                                        obj4 = objArr5[i21];
                                        i22 = i20;
                                        if (!((vy2) obj4).a.equals(str2)) {
                                            i21++;
                                            i20 = i22;
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                vy2Var2 = (vy2) obj4;
                                if (vy2Var2 == null) {
                                    ed6 ed6Var3 = (ed6) sy4Var3.f.getValue();
                                    StringBuilder sb3 = new StringBuilder();
                                    i14 = i2;
                                    sb3.append("Got folder in foldersOrder, but not in local folders (");
                                    sb3.append(str2);
                                    sb3.append(")");
                                    npk.a(ed6Var3, new ImpossibleLocalCacheStateException(sb3.toString()));
                                    z = true;
                                } else {
                                    i14 = i2;
                                    arrayList.add(new ylc(new Integer(i4), vy2Var2));
                                }
                                it = it7;
                                i2 = i14;
                                i4 = i15;
                            } else {
                                z2 = z;
                                i14 = i2;
                                i15 = i13;
                                objArr = u8bVar2.a;
                                i16 = u8bVar2.b;
                                i17 = 0;
                                while (i17 < i16) {
                                    objArr2 = objArr;
                                    if (((vy2) objArr[i17]).a.equals(str2)) {
                                        objArr3 = u8bVar2.a;
                                        i18 = u8bVar2.b;
                                        i19 = 0;
                                        while (true) {
                                            if (i19 < i18) {
                                                obj3 = objArr3[i19];
                                                objArr4 = objArr3;
                                                if (!((vy2) obj3).a.equals(str2)) {
                                                    i19++;
                                                    objArr3 = objArr4;
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        vy2Var = (vy2) obj3;
                                        if (vy2Var == null) {
                                            npk.a((ed6) sy4Var3.f.getValue(), new ImpossibleNotifException("Got folder in foldersOrder, but not in folders (" + str2 + ")"));
                                        } else {
                                            arrayList2.add(new ylc(new Integer(i4), vy2Var));
                                        }
                                    } else {
                                        i17++;
                                        objArr = objArr2;
                                    }
                                }
                            }
                            z = z2;
                            it = it7;
                            i2 = i14;
                            i4 = i15;
                        }
                        i5 = i2;
                        if (z) {
                            ((b47) sy4Var3.i.getValue()).a();
                        }
                        if (arrayList.isEmpty()) {
                            this.e = sy4Var4;
                            this.f = sy4Var3;
                            this.g = list3;
                            this.h = u8bVar2;
                            this.i = j9bVar2;
                            this.j = null;
                            this.k = j9bVar4;
                            this.l = arrayList2;
                            this.m = j2;
                            this.n = i5;
                            i10 = i3;
                            this.o = i10;
                            this.p = 0;
                            this.q = 0;
                            this.r = 3;
                            hu4Var = hu4Var2;
                            if (sy4.b(sy4Var3, arrayList, this) == hu4Var) {
                                return hu4Var;
                            }
                            arrayList3 = arrayList2;
                            i11 = i5;
                            i7 = i10;
                            list4 = list3;
                            j9bVar6 = j9bVar2;
                            i8 = 0;
                            i12 = 0;
                            long j8 = j2;
                            sy4Var5 = sy4Var4;
                            i9 = i12;
                            j9bVar2 = j9bVar6;
                            j9bVar5 = j9bVar4;
                            j3 = j8;
                            ArrayList arrayList8 = arrayList3;
                            i6 = i11;
                            arrayList2 = arrayList8;
                        } else {
                            hu4Var = hu4Var2;
                            i6 = i5;
                            i7 = i3;
                            list4 = list3;
                            i8 = 0;
                            j9bVar5 = j9bVar4;
                            j3 = j2;
                            sy4Var5 = sy4Var4;
                            i9 = 0;
                        }
                        if (arrayList2.isEmpty()) {
                            this.e = sy4Var5;
                            this.f = sy4Var3;
                            this.g = list4;
                            this.h = u8bVar2;
                            this.i = j9bVar2;
                            this.j = null;
                            this.k = j9bVar5;
                            this.l = null;
                            this.m = j3;
                            this.n = i6;
                            this.o = i7;
                            this.p = i9;
                            this.q = i8;
                            this.r = 4;
                            if (sy4.e(sy4Var3, arrayList2, this) == hu4Var) {
                                return hu4Var;
                            }
                            j9b j9bVar14 = j9bVar2;
                            i25 = i9;
                            j9bVar7 = j9bVar14;
                            i26 = i6;
                            int i312 = i25;
                            j9bVar2 = j9bVar7;
                            i9 = i312;
                            int i313 = i26;
                            i23 = i7;
                            sy4Var6 = sy4Var5;
                            i24 = i313;
                        } else {
                            i23 = i7;
                            sy4Var6 = sy4Var5;
                            i24 = i6;
                        }
                        if (list4.isEmpty()) {
                            break;
                        }
                        list5 = list4;
                        i28 = i24;
                        sy4Var7 = sy4Var6;
                        if (!list5.isEmpty()) {
                            c9b c9bVar4 = r1f.a;
                            c9bVar = new c9b();
                            u8b u8bVar11 = sy4Var3.l;
                            objArr6 = u8bVar11.a;
                            i29 = u8bVar11.b;
                            i30 = 0;
                            while (i30 < i29) {
                                int i48 = i29;
                                str4 = (String) objArr6[i30];
                                int i49 = i30;
                                str5 = str6;
                                if (cqk.d(str4, str5)) {
                                }
                                str6 = str5;
                                i30 = i49 + 1;
                                i29 = i48;
                            }
                            str3 = str6;
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list5;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar5;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i28;
                            this.o = i23;
                            this.p = i9;
                            this.q = i8;
                            this.r = 6;
                            if (sy4.d(sy4Var3, c9bVar, this) == hu4Var) {
                                return hu4Var;
                            }
                            i31 = i23;
                            i32 = i28;
                            j9b j9bVar15 = j9bVar5;
                            list6 = list5;
                            bre breVarK3 = sy4Var3.k();
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list6;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar15;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i32;
                            this.o = i31;
                            this.p = i9;
                            this.q = i8;
                            this.r = 7;
                            i33 = i9;
                            i34 = i8;
                            objH = ch3.H(this, new vy6(breVarK3, list6, null, 2), breVarK3.a);
                            if (objH != hu4Var) {
                                objH = sbiVar;
                            }
                            if (objH == hu4Var) {
                                return hu4Var;
                            }
                            i35 = i31;
                            sy4Var8 = sy4Var7;
                            i36 = i34;
                            i37 = i33;
                            j4 = j3;
                            u8b u8bVar12 = sy4Var3.l;
                            u8bVar12.f();
                            u8bVar12.b(str3);
                            u8b u8bVar13 = sy4Var3.l;
                            arrayList4 = new ArrayList();
                            it2 = list6.iterator();
                            while (it2.hasNext()) {
                                next2 = it2.next();
                                Iterator it8 = it2;
                                if (!cqk.d((String) next2, str3)) {
                                    arrayList4.add(next2);
                                }
                                it2 = it8;
                            }
                            u8bVar13.d(arrayList4);
                            pzfVar = sy4Var3.m;
                            u8bVar3 = sy4Var3.l;
                            this.e = sy4Var8;
                            this.f = j9bVar2;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = j4;
                            this.n = i32;
                            this.o = i35;
                            this.p = i37;
                            this.q = i36;
                            this.r = 8;
                            if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                return hu4Var;
                            }
                            sy4Var9 = sy4Var8;
                            sy4Var7 = sy4Var9;
                            j3 = j4;
                        }
                        ((xb9) sy4Var7.i()).h0(j3);
                        j9bVar2.g(null);
                        return sbiVar;
                    case 3:
                        i8 = this.q;
                        i12 = this.p;
                        i7 = this.o;
                        int i50 = this.n;
                        long j9 = this.m;
                        ArrayList arrayList9 = this.l;
                        j9bVar4 = this.k;
                        j9bVar6 = this.i;
                        u8bVar2 = (u8b) this.h;
                        list4 = this.g;
                        sy4Var3 = (sy4) this.f;
                        sbiVar = sbiVar;
                        sy4Var4 = this.e;
                        ch3.d0(obj);
                        str6 = "all.chat.folder";
                        arrayList3 = arrayList9;
                        j2 = j9;
                        hu4Var = hu4Var2;
                        i11 = i50;
                        long j10 = j2;
                        sy4Var5 = sy4Var4;
                        i9 = i12;
                        j9bVar2 = j9bVar6;
                        j9bVar5 = j9bVar4;
                        j3 = j10;
                        ArrayList arrayList10 = arrayList3;
                        i6 = i11;
                        arrayList2 = arrayList10;
                        if (arrayList2.isEmpty()) {
                            this.e = sy4Var5;
                            this.f = sy4Var3;
                            this.g = list4;
                            this.h = u8bVar2;
                            this.i = j9bVar2;
                            this.j = null;
                            this.k = j9bVar5;
                            this.l = null;
                            this.m = j3;
                            this.n = i6;
                            this.o = i7;
                            this.p = i9;
                            this.q = i8;
                            this.r = 4;
                            if (sy4.e(sy4Var3, arrayList2, this) == hu4Var) {
                                return hu4Var;
                            }
                            j9b j9bVar16 = j9bVar2;
                            i25 = i9;
                            j9bVar7 = j9bVar16;
                            i26 = i6;
                            int i314 = i25;
                            j9bVar2 = j9bVar7;
                            i9 = i314;
                            int i315 = i26;
                            i23 = i7;
                            sy4Var6 = sy4Var5;
                            i24 = i315;
                        } else {
                            i23 = i7;
                            sy4Var6 = sy4Var5;
                            i24 = i6;
                        }
                        if (list4.isEmpty()) {
                            break;
                        }
                        list5 = list4;
                        i28 = i24;
                        sy4Var7 = sy4Var6;
                        if (!list5.isEmpty()) {
                            c9b c9bVar5 = r1f.a;
                            c9bVar = new c9b();
                            u8b u8bVar14 = sy4Var3.l;
                            objArr6 = u8bVar14.a;
                            i29 = u8bVar14.b;
                            i30 = 0;
                            while (i30 < i29) {
                                int i410 = i29;
                                str4 = (String) objArr6[i30];
                                int i411 = i30;
                                str5 = str6;
                                if (cqk.d(str4, str5)) {
                                }
                                str6 = str5;
                                i30 = i411 + 1;
                                i29 = i410;
                            }
                            str3 = str6;
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list5;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar5;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i28;
                            this.o = i23;
                            this.p = i9;
                            this.q = i8;
                            this.r = 6;
                            if (sy4.d(sy4Var3, c9bVar, this) == hu4Var) {
                                return hu4Var;
                            }
                            i31 = i23;
                            i32 = i28;
                            j9b j9bVar17 = j9bVar5;
                            list6 = list5;
                            bre breVarK4 = sy4Var3.k();
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list6;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar17;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i32;
                            this.o = i31;
                            this.p = i9;
                            this.q = i8;
                            this.r = 7;
                            i33 = i9;
                            i34 = i8;
                            objH = ch3.H(this, new vy6(breVarK4, list6, null, 2), breVarK4.a);
                            if (objH != hu4Var) {
                                objH = sbiVar;
                            }
                            if (objH == hu4Var) {
                                return hu4Var;
                            }
                            i35 = i31;
                            sy4Var8 = sy4Var7;
                            i36 = i34;
                            i37 = i33;
                            j4 = j3;
                            u8b u8bVar15 = sy4Var3.l;
                            u8bVar15.f();
                            u8bVar15.b(str3);
                            u8b u8bVar16 = sy4Var3.l;
                            arrayList4 = new ArrayList();
                            it2 = list6.iterator();
                            while (it2.hasNext()) {
                                next2 = it2.next();
                                Iterator it9 = it2;
                                if (!cqk.d((String) next2, str3)) {
                                    arrayList4.add(next2);
                                }
                                it2 = it9;
                            }
                            u8bVar16.d(arrayList4);
                            pzfVar = sy4Var3.m;
                            u8bVar3 = sy4Var3.l;
                            this.e = sy4Var8;
                            this.f = j9bVar2;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = j4;
                            this.n = i32;
                            this.o = i35;
                            this.p = i37;
                            this.q = i36;
                            this.r = 8;
                            if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                return hu4Var;
                            }
                            sy4Var9 = sy4Var8;
                            sy4Var7 = sy4Var9;
                            j3 = j4;
                        }
                        ((xb9) sy4Var7.i()).h0(j3);
                        j9bVar2.g(null);
                        return sbiVar;
                    case 4:
                        i8 = this.q;
                        i25 = this.p;
                        i7 = this.o;
                        i26 = this.n;
                        long j11 = this.m;
                        j9b j9bVar18 = this.k;
                        j9b j9bVar19 = this.i;
                        u8bVar2 = (u8b) this.h;
                        list4 = this.g;
                        sy4Var3 = (sy4) this.f;
                        sy4 sy4Var12 = this.e;
                        ch3.d0(obj);
                        sbiVar = sbiVar;
                        str6 = "all.chat.folder";
                        j9bVar7 = j9bVar19;
                        j9bVar5 = j9bVar18;
                        j3 = j11;
                        sy4Var5 = sy4Var12;
                        hu4Var = hu4Var2;
                        int i316 = i25;
                        j9bVar2 = j9bVar7;
                        i9 = i316;
                        int i317 = i26;
                        i23 = i7;
                        sy4Var6 = sy4Var5;
                        i24 = i317;
                        if (list4.isEmpty()) {
                            break;
                        }
                        list5 = list4;
                        i28 = i24;
                        sy4Var7 = sy4Var6;
                        if (!list5.isEmpty()) {
                            c9b c9bVar6 = r1f.a;
                            c9bVar = new c9b();
                            u8b u8bVar17 = sy4Var3.l;
                            objArr6 = u8bVar17.a;
                            i29 = u8bVar17.b;
                            i30 = 0;
                            while (i30 < i29) {
                                int i412 = i29;
                                str4 = (String) objArr6[i30];
                                int i413 = i30;
                                str5 = str6;
                                if (cqk.d(str4, str5)) {
                                }
                                str6 = str5;
                                i30 = i413 + 1;
                                i29 = i412;
                            }
                            str3 = str6;
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list5;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar5;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i28;
                            this.o = i23;
                            this.p = i9;
                            this.q = i8;
                            this.r = 6;
                            if (sy4.d(sy4Var3, c9bVar, this) == hu4Var) {
                                return hu4Var;
                            }
                            i31 = i23;
                            i32 = i28;
                            j9b j9bVar110 = j9bVar5;
                            list6 = list5;
                            bre breVarK5 = sy4Var3.k();
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list6;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar110;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i32;
                            this.o = i31;
                            this.p = i9;
                            this.q = i8;
                            this.r = 7;
                            i33 = i9;
                            i34 = i8;
                            objH = ch3.H(this, new vy6(breVarK5, list6, null, 2), breVarK5.a);
                            if (objH != hu4Var) {
                                objH = sbiVar;
                            }
                            if (objH == hu4Var) {
                                return hu4Var;
                            }
                            i35 = i31;
                            sy4Var8 = sy4Var7;
                            i36 = i34;
                            i37 = i33;
                            j4 = j3;
                            u8b u8bVar18 = sy4Var3.l;
                            u8bVar18.f();
                            u8bVar18.b(str3);
                            u8b u8bVar19 = sy4Var3.l;
                            arrayList4 = new ArrayList();
                            it2 = list6.iterator();
                            while (it2.hasNext()) {
                                next2 = it2.next();
                                Iterator it10 = it2;
                                if (!cqk.d((String) next2, str3)) {
                                    arrayList4.add(next2);
                                }
                                it2 = it10;
                            }
                            u8bVar19.d(arrayList4);
                            pzfVar = sy4Var3.m;
                            u8bVar3 = sy4Var3.l;
                            this.e = sy4Var8;
                            this.f = j9bVar2;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = j4;
                            this.n = i32;
                            this.o = i35;
                            this.p = i37;
                            this.q = i36;
                            this.r = 8;
                            if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                return hu4Var;
                            }
                            sy4Var9 = sy4Var8;
                            sy4Var7 = sy4Var9;
                            j3 = j4;
                        }
                        ((xb9) sy4Var7.i()).h0(j3);
                        j9bVar2.g(null);
                        return sbiVar;
                    case 5:
                        i8 = this.q;
                        i27 = this.p;
                        i23 = this.o;
                        i24 = this.n;
                        j3 = this.m;
                        j9bVar5 = this.j;
                        j9bVar8 = (j9b) this.h;
                        list5 = this.g;
                        sy4Var3 = (sy4) this.f;
                        sy4Var6 = this.e;
                        ch3.d0(obj);
                        sbiVar = sbiVar;
                        hu4Var = hu4Var2;
                        str6 = "all.chat.folder";
                        i9 = i27;
                        j9bVar2 = j9bVar8;
                        i28 = i24;
                        sy4Var7 = sy4Var6;
                        if (!list5.isEmpty()) {
                            c9b c9bVar7 = r1f.a;
                            c9bVar = new c9b();
                            u8b u8bVar110 = sy4Var3.l;
                            objArr6 = u8bVar110.a;
                            i29 = u8bVar110.b;
                            i30 = 0;
                            while (i30 < i29) {
                                int i414 = i29;
                                str4 = (String) objArr6[i30];
                                int i415 = i30;
                                str5 = str6;
                                if (cqk.d(str4, str5)) {
                                }
                                str6 = str5;
                                i30 = i415 + 1;
                                i29 = i414;
                            }
                            str3 = str6;
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list5;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar5;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i28;
                            this.o = i23;
                            this.p = i9;
                            this.q = i8;
                            this.r = 6;
                            if (sy4.d(sy4Var3, c9bVar, this) == hu4Var) {
                                return hu4Var;
                            }
                            i31 = i23;
                            i32 = i28;
                            j9b j9bVar111 = j9bVar5;
                            list6 = list5;
                            bre breVarK6 = sy4Var3.k();
                            this.e = sy4Var7;
                            this.f = sy4Var3;
                            this.g = list6;
                            this.h = j9bVar2;
                            this.i = null;
                            this.j = j9bVar111;
                            this.k = null;
                            this.l = null;
                            this.m = j3;
                            this.n = i32;
                            this.o = i31;
                            this.p = i9;
                            this.q = i8;
                            this.r = 7;
                            i33 = i9;
                            i34 = i8;
                            objH = ch3.H(this, new vy6(breVarK6, list6, null, 2), breVarK6.a);
                            if (objH != hu4Var) {
                                objH = sbiVar;
                            }
                            if (objH == hu4Var) {
                                return hu4Var;
                            }
                            i35 = i31;
                            sy4Var8 = sy4Var7;
                            i36 = i34;
                            i37 = i33;
                            j4 = j3;
                            u8b u8bVar111 = sy4Var3.l;
                            u8bVar111.f();
                            u8bVar111.b(str3);
                            u8b u8bVar112 = sy4Var3.l;
                            arrayList4 = new ArrayList();
                            it2 = list6.iterator();
                            while (it2.hasNext()) {
                                next2 = it2.next();
                                Iterator it11 = it2;
                                if (!cqk.d((String) next2, str3)) {
                                    arrayList4.add(next2);
                                }
                                it2 = it11;
                            }
                            u8bVar112.d(arrayList4);
                            pzfVar = sy4Var3.m;
                            u8bVar3 = sy4Var3.l;
                            this.e = sy4Var8;
                            this.f = j9bVar2;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = j4;
                            this.n = i32;
                            this.o = i35;
                            this.p = i37;
                            this.q = i36;
                            this.r = 8;
                            if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                return hu4Var;
                            }
                            sy4Var9 = sy4Var8;
                            sy4Var7 = sy4Var9;
                            j3 = j4;
                        }
                        ((xb9) sy4Var7.i()).h0(j3);
                        j9bVar2.g(null);
                        return sbiVar;
                    case 6:
                        i8 = this.q;
                        int i51 = this.p;
                        int i52 = this.o;
                        int i53 = this.n;
                        j3 = this.m;
                        j9bVar5 = this.j;
                        j9b j9bVar20 = (j9b) this.h;
                        list5 = this.g;
                        sy4Var3 = (sy4) this.f;
                        sy4Var7 = this.e;
                        ch3.d0(obj);
                        sbiVar = sbiVar;
                        i9 = i51;
                        i31 = i52;
                        i32 = i53;
                        j9bVar2 = j9bVar20;
                        hu4Var = hu4Var2;
                        str3 = "all.chat.folder";
                        j9b j9bVar112 = j9bVar5;
                        list6 = list5;
                        bre breVarK7 = sy4Var3.k();
                        this.e = sy4Var7;
                        this.f = sy4Var3;
                        this.g = list6;
                        this.h = j9bVar2;
                        this.i = null;
                        this.j = j9bVar112;
                        this.k = null;
                        this.l = null;
                        this.m = j3;
                        this.n = i32;
                        this.o = i31;
                        this.p = i9;
                        this.q = i8;
                        this.r = 7;
                        i33 = i9;
                        i34 = i8;
                        objH = ch3.H(this, new vy6(breVarK7, list6, null, 2), breVarK7.a);
                        if (objH != hu4Var) {
                            objH = sbiVar;
                        }
                        if (objH == hu4Var) {
                            return hu4Var;
                        }
                        i35 = i31;
                        sy4Var8 = sy4Var7;
                        i36 = i34;
                        i37 = i33;
                        j4 = j3;
                        u8b u8bVar113 = sy4Var3.l;
                        u8bVar113.f();
                        u8bVar113.b(str3);
                        u8b u8bVar114 = sy4Var3.l;
                        arrayList4 = new ArrayList();
                        it2 = list6.iterator();
                        while (it2.hasNext()) {
                            next2 = it2.next();
                            Iterator it12 = it2;
                            if (!cqk.d((String) next2, str3)) {
                                arrayList4.add(next2);
                            }
                            it2 = it12;
                        }
                        u8bVar114.d(arrayList4);
                        pzfVar = sy4Var3.m;
                        u8bVar3 = sy4Var3.l;
                        this.e = sy4Var8;
                        this.f = j9bVar2;
                        this.g = null;
                        this.h = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.l = null;
                        this.m = j4;
                        this.n = i32;
                        this.o = i35;
                        this.p = i37;
                        this.q = i36;
                        this.r = 8;
                        if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                            return hu4Var;
                        }
                        sy4Var9 = sy4Var8;
                        sy4Var7 = sy4Var9;
                        j3 = j4;
                        ((xb9) sy4Var7.i()).h0(j3);
                        j9bVar2.g(null);
                        return sbiVar;
                    case 7:
                        int i54 = this.q;
                        int i55 = this.p;
                        int i56 = this.o;
                        i32 = this.n;
                        j3 = this.m;
                        j9b j9bVar21 = (j9b) this.h;
                        list6 = this.g;
                        sy4 sy4Var13 = (sy4) this.f;
                        sy4Var8 = this.e;
                        try {
                            ch3.d0(obj);
                            sbiVar = sbiVar;
                            i36 = i54;
                            sy4Var3 = sy4Var13;
                            str3 = "all.chat.folder";
                            i35 = i56;
                            i37 = i55;
                            j9bVar2 = j9bVar21;
                            hu4Var = hu4Var2;
                            j4 = j3;
                            u8b u8bVar115 = sy4Var3.l;
                            u8bVar115.f();
                            u8bVar115.b(str3);
                            u8b u8bVar116 = sy4Var3.l;
                            arrayList4 = new ArrayList();
                            it2 = list6.iterator();
                            while (it2.hasNext()) {
                                next2 = it2.next();
                                Iterator it13 = it2;
                                if (!cqk.d((String) next2, str3)) {
                                    arrayList4.add(next2);
                                }
                                it2 = it13;
                            }
                            u8bVar116.d(arrayList4);
                            pzfVar = sy4Var3.m;
                            u8bVar3 = sy4Var3.l;
                            this.e = sy4Var8;
                            this.f = j9bVar2;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = j4;
                            this.n = i32;
                            this.o = i35;
                            this.p = i37;
                            this.q = i36;
                            this.r = 8;
                            if (pzfVar.emit(u8bVar3, this) == hu4Var) {
                                return hu4Var;
                            }
                            sy4Var9 = sy4Var8;
                            sy4Var7 = sy4Var9;
                            j3 = j4;
                            ((xb9) sy4Var7.i()).h0(j3);
                            j9bVar2.g(null);
                            return sbiVar;
                        } catch (Throwable th2) {
                            th = th2;
                            j9bVar2 = j9bVar21;
                            obj2 = null;
                            j9bVar2.g(obj2);
                            throw th;
                        }
                    case 8:
                        j4 = this.m;
                        j9bVar2 = (j9b) this.f;
                        sy4Var9 = this.e;
                        try {
                            ch3.d0(obj);
                            sbiVar = sbiVar;
                            sy4Var7 = sy4Var9;
                            j3 = j4;
                            ((xb9) sy4Var7.i()).h0(j3);
                            j9bVar2.g(null);
                            return sbiVar;
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = null;
                            j9bVar2.g(obj2);
                            throw th;
                        }
                    default:
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th4) {
                th = th4;
                j9bVar2 = j9bVar;
            }
        } catch (Throwable th5) {
            th = th5;
            j9bVar2 = j9bVar3;
        }
    }
}
