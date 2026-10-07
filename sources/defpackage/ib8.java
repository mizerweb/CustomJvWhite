package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ib8 extends mdh implements qf7 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gh7 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ rb8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib8(boolean z, gh7 gh7Var, String str, String[] strArr, rb8 rb8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = z;
        this.f = gh7Var;
        this.g = str;
        this.h = strArr;
        this.i = rb8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ib8(this.e, this.f, this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ib8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IOException {
        int columnIndex;
        int columnIndex2;
        Integer num;
        Integer num2;
        Integer num3;
        ch3.d0(obj);
        boolean z = this.e;
        gh7 gh7Var = this.f;
        gh7 gh7Var2 = this.f;
        String strV = z ? nbh.v(gh7Var.d(), " ASC, ", gh7Var2.f(), " ASC") : nbh.v(gh7Var.d(), " DESC, ", gh7Var2.f(), " DESC");
        int i = 40;
        ArrayList arrayList = new ArrayList(40);
        Cursor cursorQuery = this.i.e.query(this.f.j(), this.f.l(), l6i.c(new Integer(40), new Integer(0), this.g, this.h, strV), null);
        if (cursorQuery == null) {
            return arrayList;
        }
        gh7 gh7Var3 = this.f;
        rb8 rb8Var = this.i;
        try {
            int columnIndex3 = cursorQuery.getColumnIndex(gh7Var3.f());
            if (columnIndex3 != -1 && (columnIndex = cursorQuery.getColumnIndex(gh7Var3.c())) != -1 && (columnIndex2 = cursorQuery.getColumnIndex(gh7Var3.d())) != -1) {
                Integer num4 = new Integer(cursorQuery.getColumnIndex(gh7Var3.h()));
                if (num4.intValue() == -1) {
                    num4 = null;
                }
                String strI = gh7Var3.i();
                if (strI != null) {
                    num = new Integer(cursorQuery.getColumnIndex(strI));
                    if (num.intValue() == -1) {
                        num = null;
                    }
                } else {
                    num = null;
                }
                String strE = gh7Var3.e();
                if (strE != null) {
                    num2 = new Integer(cursorQuery.getColumnIndex(strE));
                    if (num2.intValue() == -1) {
                        num2 = null;
                    }
                } else {
                    num2 = null;
                }
                String strG = gh7Var3.g();
                if (strG != null) {
                    num3 = new Integer(cursorQuery.getColumnIndex(strG));
                    if (num3.intValue() == -1) {
                        num3 = null;
                    }
                } else {
                    num3 = null;
                }
                while (cursorQuery.moveToNext() && arrayList.size() < i) {
                    gh7Var3 = gh7Var3;
                    long j = cursorQuery.getLong(columnIndex3);
                    Uri uriB = gpl.b(cursorQuery, columnIndex);
                    if (uriB == null) {
                        uriB = ContentUris.withAppendedId(gh7Var3.j(), j);
                    }
                    long j2 = cursorQuery.getLong(columnIndex2);
                    int i2 = num != null ? cursorQuery.getInt(num.intValue()) : 0;
                    long j3 = num2 != null ? cursorQuery.getLong(num2.intValue()) : 0L;
                    String strK = gh7Var3.k();
                    if (num4 == null) {
                        columnIndex3 = columnIndex3;
                    } else {
                        columnIndex3 = columnIndex3;
                        String string = cursorQuery.getString(num4.intValue());
                        if (string != null) {
                            strK = string;
                        }
                    }
                    ylc ylcVarA = rb8.a(rb8Var, strK, num3 != null ? new Integer(cursorQuery.getInt(num3.intValue())) : null);
                    String str = (String) ylcVarA.a;
                    if (((jb9) ylcVarA.b) != jb9.a) {
                        if (l6i.a(rb8Var.b, uriB)) {
                            arrayList.add(new kb9(j, uriB, str, -1, j2, new Integer(i2), new Long(j3), uriB, 896));
                        } else {
                            String str2 = rb8.u;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str2, "queryKeysetPage: " + j + " is not valid uri", null);
                                    i = 40;
                                }
                            }
                        }
                    }
                    i = 40;
                }
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(cursorQuery, th);
                throw th2;
            }
        }
    }
}
