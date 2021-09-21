#!/bin/sh
createdb -e -U "postgres" "testdb"
#createdb -e -U "$POSTGRES_USER" "sp_file_storage"
#createdb -e -U "$POSTGRES_USER" "esia_emulator"