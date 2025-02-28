SELECT * FROM murid;
SELECT * FROM pendidikan;

SELECT murid.id AS id_murid, murid.name, pendidikan.status AS pendidikan_terakhir, murid.time_create, pendidikan.time_create AS time_update  
FROM murid
INNER JOIN pendidikan ON murid.id = pendidikan.id_murid
WHERE pendidikan.id = (
    SELECT pendidikan.id
    FROM pendidikan
    WHERE murid.id = pendidikan.id_murid
    ORDER BY pendidikan.time_create DESC
    LIMIT 1
);