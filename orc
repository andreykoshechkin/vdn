UPDATE externalAcc e SET e.bankName = ( SELECT b.bankName FROM bankNameInv b WHERE e.debitExtAcc = b.debitExtAcc ) WHERE EXISTS ( SELECT 1 FROM bankNameInv b WHERE e.debitExtAcc = b.debitExtAcc );
