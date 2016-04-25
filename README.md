# hbase-employee-info
- Build Date: Apr 2016
- Technology: Maven 3, Cloudera Quickstart VMH 5.5.0.0 (Hbase)

Connecting to VM instance and performing CRUD operations on Hbase.

Sample Output:
```sh
Search Parameters - None - Show complete table
Cell: 101/personal:city/1461558794321/Put/vlen=9/seqid=0# Value: San Mateo
Cell: 101/personal:name/1461558794306/Put/vlen=13/seqid=0# Value: Steve Wozniak
Cell: 101/professional:designation/1461558794328/Put/vlen=2/seqid=0# Value: VP
Cell: 101/professional:salary/1461558794333/Put/vlen=4/seqid=0# Value: 5000
Cell: 102/personal:city/1461558794343/Put/vlen=9/seqid=0# Value: Cupertino
Cell: 102/personal:name/1461558794338/Put/vlen=8/seqid=0# Value: Tim Cook
Cell: 102/professional:designation/1461558794347/Put/vlen=3/seqid=0# Value: CEO
Cell: 102/professional:salary/1461558794352/Put/vlen=4/seqid=0# Value: 1000
Search Parameters - Get selected data for row
Cell: 101/personal:city/1461558794321/Put/vlen=9/seqid=0# Value: San Mateo
Cell: 101/personal:name/1461558794306/Put/vlen=13/seqid=0# Value: Steve Wozniak
Search Parameters - Get all data for row
Cell: 102/personal:city/1461558794343/Put/vlen=9/seqid=0# Value: Cupertino
Cell: 102/personal:name/1461558794338/Put/vlen=8/seqid=0# Value: Tim Cook
Cell: 102/professional:designation/1461558794347/Put/vlen=3/seqid=0# Value: CEO
Cell: 102/professional:salary/1461558794352/Put/vlen=4/seqid=0# Value: 1000

```
